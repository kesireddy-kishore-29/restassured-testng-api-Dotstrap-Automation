# Transcript: A token stops working when it expires

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#expiredTokenIsRefused` |
| Features | FEAT-SEC-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 423 | `qa-1db12c79-9681-44ec-9d49-b1b34047d55d` |
| 2 | `POST /v1/auth/token` | 200 | 43 | `qa-f1c2f8ff-ba7e-435d-b583-f902c1f26f4a` |
| 3 | `GET /v1/accounts/me` | 200 | 16 | `qa-3732ae80-28dd-41cc-8cbc-f95dd9968c66` |
| 4 | `GET /v1/accounts/me` | 200 | 15 | `qa-ed356807-c39f-4413-a213-7f5bd0729409` |
| 5 | `GET /v1/accounts/me` | 200 | 33 | `qa-9eabc10b-692f-4aa6-bf3d-8e1c728685c0` |
| 6 | `GET /v1/accounts/me` | 401 | 9 | `qa-72e0725f-967d-4721-aef1-2b5791222915` |
| 7 | `GET /v1/accounts/me` | 401 | 10 | `qa-e1d4014b-2a52-4bc3-9157-c2296bb7339c` |
| 8 | `POST /v1/auth/token` | 200 | 16 | `qa-cd86ded3-2b00-45fa-b756-862ca68e1c4e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-e218d501-c7ea-4354-b9e8-142d2c8a7bec` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-9c4f68f7-0ca4-49e7-81f0-00821bf867ff` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1db12c79-9681-44ec-9d49-b1b34047d55d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1db12c79-9681-44ec-9d49-b1b34047d55d
Content-Type: application/json

--- request body ---
{"handle":"qa-518b4f4743fc","displayName":"QA 518b4f4743fc","password":"****","region":"eu"}

--- response: 201 in 423 ms ---
Date: Tue, 27 Oct 2026 08:00:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-1db12c79-9681-44ec-9d49-b1b34047d55d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-518b4f4743fc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ead926bf-7554-4bdf-a174-c1602c90bde0","handle":"qa-518b4f4743fc","displayName":"QA 518b4f4743fc","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.056680749Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f1c2f8ff-ba7e-435d-b583-f902c1f26f4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1c2f8ff-ba7e-435d-b583-f902c1f26f4a
Content-Type: application/json

--- request body ---
{"handle":"qa-518b4f4743fc","password":"****","ttlSeconds":1}

--- response: 200 in 43 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1c2f8ff-ba7e-435d-b583-f902c1f26f4a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_ead926bf-7554-4bdf-a174-c1602c90bde0"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-3732ae80-28dd-41cc-8cbc-f95dd9968c66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3732ae80-28dd-41cc-8cbc-f95dd9968c66
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-3732ae80-28dd-41cc-8cbc-f95dd9968c66
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ead926bf-7554-4bdf-a174-c1602c90bde0","handle":"qa-518b4f4743fc","displayName":"QA 518b4f4743fc","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.056680749Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-ed356807-c39f-4413-a213-7f5bd0729409

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed356807-c39f-4413-a213-7f5bd0729409
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed356807-c39f-4413-a213-7f5bd0729409
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ead926bf-7554-4bdf-a174-c1602c90bde0","handle":"qa-518b4f4743fc","displayName":"QA 518b4f4743fc","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.056680749Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-9eabc10b-692f-4aa6-bf3d-8e1c728685c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9eabc10b-692f-4aa6-bf3d-8e1c728685c0
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-9eabc10b-692f-4aa6-bf3d-8e1c728685c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ead926bf-7554-4bdf-a174-c1602c90bde0","handle":"qa-518b4f4743fc","displayName":"QA 518b4f4743fc","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.056680749Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-72e0725f-967d-4721-aef1-2b5791222915

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72e0725f-967d-4721-aef1-2b5791222915
Content-Type: application/json

--- response: 401 in 9 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-72e0725f-967d-4721-aef1-2b5791222915
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-72e0725f-967d-4721-aef1-2b5791222915"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-e1d4014b-2a52-4bc3-9157-c2296bb7339c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1d4014b-2a52-4bc3-9157-c2296bb7339c
Content-Type: application/json

--- response: 401 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1d4014b-2a52-4bc3-9157-c2296bb7339c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-e1d4014b-2a52-4bc3-9157-c2296bb7339c"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-cd86ded3-2b00-45fa-b756-862ca68e1c4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd86ded3-2b00-45fa-b756-862ca68e1c4e
Content-Type: application/json

--- request body ---
{"handle":"qa-518b4f4743fc","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd86ded3-2b00-45fa-b756-862ca68e1c4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ead926bf-7554-4bdf-a174-c1602c90bde0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e218d501-c7ea-4354-b9e8-142d2c8a7bec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e218d501-c7ea-4354-b9e8-142d2c8a7bec
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e218d501-c7ea-4354-b9e8-142d2c8a7bec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-9c4f68f7-0ca4-49e7-81f0-00821bf867ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c4f68f7-0ca4-49e7-81f0-00821bf867ff
Content-Type: application/json

--- request body ---
{"handle":"qa-518b4f4743fc","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9c4f68f7-0ca4-49e7-81f0-00821bf867ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9c4f68f7-0ca4-49e7-81f0-00821bf867ff"}
```
