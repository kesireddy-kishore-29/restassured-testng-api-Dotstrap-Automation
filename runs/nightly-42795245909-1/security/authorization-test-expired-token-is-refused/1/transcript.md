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
| 1 | `POST /v1/accounts` | 201 | 345 | `qa-443e306a-c7e1-401e-8e31-c32108466723` |
| 2 | `POST /v1/auth/token` | 200 | 30 | `qa-8b98e9f3-b99e-4ca9-b2fc-9670cd03826d` |
| 3 | `GET /v1/accounts/me` | 200 | 23 | `qa-48241eeb-43c2-4bfa-8a71-d3fefff7fa2e` |
| 4 | `GET /v1/accounts/me` | 200 | 14 | `qa-f345ec05-9c95-463f-bb00-d0903173291e` |
| 5 | `GET /v1/accounts/me` | 200 | 3 | `qa-5d300e85-34dd-43f4-81d9-62a4899b444a` |
| 6 | `GET /v1/accounts/me` | 401 | 3 | `qa-46e9e73c-2951-4160-9d5b-4980b27eff6e` |
| 7 | `GET /v1/accounts/me` | 401 | 4 | `qa-0b9e36ba-96d6-4ba8-bef2-1f283f09823d` |
| 8 | `POST /v1/auth/token` | 200 | 6 | `qa-0d797920-7621-4e15-ba98-9374f6bd66b2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-829d3332-dc16-4a37-b050-467a1ed97b64` |
| 10 | `POST /v1/auth/token` | 401 | 3 | `qa-50b185a5-014b-4061-8bbd-e3b56702ca9c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-443e306a-c7e1-401e-8e31-c32108466723

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-443e306a-c7e1-401e-8e31-c32108466723
Content-Type: application/json

--- request body ---
{"handle":"qa-c28c10aacfe8","displayName":"QA c28c10aacfe8","password":"****","region":"eu"}

--- response: 201 in 345 ms ---
Date: Tue, 10 Nov 2026 09:59:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-443e306a-c7e1-401e-8e31-c32108466723
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-c28c10aacfe8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9f1e32eb-6466-4125-b860-011f32068b3f","handle":"qa-c28c10aacfe8","displayName":"QA c28c10aacfe8","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.620626162Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8b98e9f3-b99e-4ca9-b2fc-9670cd03826d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b98e9f3-b99e-4ca9-b2fc-9670cd03826d
Content-Type: application/json

--- request body ---
{"handle":"qa-c28c10aacfe8","password":"****","ttlSeconds":1}

--- response: 200 in 30 ms ---
Date: Tue, 10 Nov 2026 09:59:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b98e9f3-b99e-4ca9-b2fc-9670cd03826d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_9f1e32eb-6466-4125-b860-011f32068b3f"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-48241eeb-43c2-4bfa-8a71-d3fefff7fa2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48241eeb-43c2-4bfa-8a71-d3fefff7fa2e
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-48241eeb-43c2-4bfa-8a71-d3fefff7fa2e
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

{"id":"acc_9f1e32eb-6466-4125-b860-011f32068b3f","handle":"qa-c28c10aacfe8","displayName":"QA c28c10aacfe8","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.620626162Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-f345ec05-9c95-463f-bb00-d0903173291e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f345ec05-9c95-463f-bb00-d0903173291e
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f345ec05-9c95-463f-bb00-d0903173291e
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

{"id":"acc_9f1e32eb-6466-4125-b860-011f32068b3f","handle":"qa-c28c10aacfe8","displayName":"QA c28c10aacfe8","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.620626162Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-5d300e85-34dd-43f4-81d9-62a4899b444a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d300e85-34dd-43f4-81d9-62a4899b444a
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d300e85-34dd-43f4-81d9-62a4899b444a
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

{"id":"acc_9f1e32eb-6466-4125-b860-011f32068b3f","handle":"qa-c28c10aacfe8","displayName":"QA c28c10aacfe8","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.620626162Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-46e9e73c-2951-4160-9d5b-4980b27eff6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46e9e73c-2951-4160-9d5b-4980b27eff6e
Content-Type: application/json

--- response: 401 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46e9e73c-2951-4160-9d5b-4980b27eff6e
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-46e9e73c-2951-4160-9d5b-4980b27eff6e"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-0b9e36ba-96d6-4ba8-bef2-1f283f09823d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b9e36ba-96d6-4ba8-bef2-1f283f09823d
Content-Type: application/json

--- response: 401 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0b9e36ba-96d6-4ba8-bef2-1f283f09823d
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-0b9e36ba-96d6-4ba8-bef2-1f283f09823d"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-0d797920-7621-4e15-ba98-9374f6bd66b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d797920-7621-4e15-ba98-9374f6bd66b2
Content-Type: application/json

--- request body ---
{"handle":"qa-c28c10aacfe8","password":"****"}

--- response: 200 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d797920-7621-4e15-ba98-9374f6bd66b2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9f1e32eb-6466-4125-b860-011f32068b3f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-829d3332-dc16-4a37-b050-467a1ed97b64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-829d3332-dc16-4a37-b050-467a1ed97b64
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-829d3332-dc16-4a37-b050-467a1ed97b64
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
correlation: qa-50b185a5-014b-4061-8bbd-e3b56702ca9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50b185a5-014b-4061-8bbd-e3b56702ca9c
Content-Type: application/json

--- request body ---
{"handle":"qa-c28c10aacfe8","password":"****"}

--- response: 401 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-50b185a5-014b-4061-8bbd-e3b56702ca9c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-50b185a5-014b-4061-8bbd-e3b56702ca9c"}
```
