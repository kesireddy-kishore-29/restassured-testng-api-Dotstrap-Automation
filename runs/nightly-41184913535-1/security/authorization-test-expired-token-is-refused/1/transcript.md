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
| 1 | `POST /v1/accounts` | 201 | 376 | `qa-5be1f0cc-8648-40d0-bc56-53baa698bf45` |
| 2 | `POST /v1/auth/token` | 200 | 42 | `qa-45aac8f1-77a7-4574-99aa-1bbe5ed9d0b4` |
| 3 | `GET /v1/accounts/me` | 200 | 17 | `qa-ba0332c2-0658-4233-8781-d7ed7e38c71b` |
| 4 | `GET /v1/accounts/me` | 200 | 14 | `qa-5a81b3c1-41b2-44e5-8b5f-4e93ee493fa9` |
| 5 | `GET /v1/accounts/me` | 200 | 6 | `qa-0e6f8dd8-53cd-4a3b-a933-f7a3bd60739d` |
| 6 | `GET /v1/accounts/me` | 401 | 15 | `qa-37927f91-fab1-4d12-a943-7524d406e5a9` |
| 7 | `GET /v1/accounts/me` | 401 | 24 | `qa-bc32d694-65bb-4a23-a64a-1aaee6d0eb98` |
| 8 | `POST /v1/auth/token` | 200 | 13 | `qa-69b5a7e9-6372-426d-bca9-e4fe436031cd` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-cc8a9e56-8cae-4a5d-a4e6-18886b7cd0c6` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-8f8c28ba-5003-4017-881e-296913c1dd2e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5be1f0cc-8648-40d0-bc56-53baa698bf45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5be1f0cc-8648-40d0-bc56-53baa698bf45
Content-Type: application/json

--- request body ---
{"handle":"qa-f80a5bd260e2","displayName":"QA f80a5bd260e2","password":"****","region":"eu"}

--- response: 201 in 376 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-5be1f0cc-8648-40d0-bc56-53baa698bf45
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
Location: /v1/accounts/qa-f80a5bd260e2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a6678efb-aa6d-4b43-8c83-148da5f2cc34","handle":"qa-f80a5bd260e2","displayName":"QA f80a5bd260e2","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.333339996Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-45aac8f1-77a7-4574-99aa-1bbe5ed9d0b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45aac8f1-77a7-4574-99aa-1bbe5ed9d0b4
Content-Type: application/json

--- request body ---
{"handle":"qa-f80a5bd260e2","password":"****","ttlSeconds":1}

--- response: 200 in 42 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-45aac8f1-77a7-4574-99aa-1bbe5ed9d0b4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_a6678efb-aa6d-4b43-8c83-148da5f2cc34"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-ba0332c2-0658-4233-8781-d7ed7e38c71b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba0332c2-0658-4233-8781-d7ed7e38c71b
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba0332c2-0658-4233-8781-d7ed7e38c71b
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

{"id":"acc_a6678efb-aa6d-4b43-8c83-148da5f2cc34","handle":"qa-f80a5bd260e2","displayName":"QA f80a5bd260e2","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.333339996Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-5a81b3c1-41b2-44e5-8b5f-4e93ee493fa9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a81b3c1-41b2-44e5-8b5f-4e93ee493fa9
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a81b3c1-41b2-44e5-8b5f-4e93ee493fa9
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

{"id":"acc_a6678efb-aa6d-4b43-8c83-148da5f2cc34","handle":"qa-f80a5bd260e2","displayName":"QA f80a5bd260e2","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.333339996Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-0e6f8dd8-53cd-4a3b-a933-f7a3bd60739d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e6f8dd8-53cd-4a3b-a933-f7a3bd60739d
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e6f8dd8-53cd-4a3b-a933-f7a3bd60739d
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

{"id":"acc_a6678efb-aa6d-4b43-8c83-148da5f2cc34","handle":"qa-f80a5bd260e2","displayName":"QA f80a5bd260e2","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.333339996Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-37927f91-fab1-4d12-a943-7524d406e5a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37927f91-fab1-4d12-a943-7524d406e5a9
Content-Type: application/json

--- response: 401 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37927f91-fab1-4d12-a943-7524d406e5a9
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-37927f91-fab1-4d12-a943-7524d406e5a9"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc32d694-65bb-4a23-a64a-1aaee6d0eb98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc32d694-65bb-4a23-a64a-1aaee6d0eb98
Content-Type: application/json

--- response: 401 in 24 ms ---
Date: Sat, 31 Oct 2026 08:31:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc32d694-65bb-4a23-a64a-1aaee6d0eb98
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-bc32d694-65bb-4a23-a64a-1aaee6d0eb98"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-69b5a7e9-6372-426d-bca9-e4fe436031cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69b5a7e9-6372-426d-bca9-e4fe436031cd
Content-Type: application/json

--- request body ---
{"handle":"qa-f80a5bd260e2","password":"****"}

--- response: 200 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-69b5a7e9-6372-426d-bca9-e4fe436031cd
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a6678efb-aa6d-4b43-8c83-148da5f2cc34"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cc8a9e56-8cae-4a5d-a4e6-18886b7cd0c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc8a9e56-8cae-4a5d-a4e6-18886b7cd0c6
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cc8a9e56-8cae-4a5d-a4e6-18886b7cd0c6
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
correlation: qa-8f8c28ba-5003-4017-881e-296913c1dd2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f8c28ba-5003-4017-881e-296913c1dd2e
Content-Type: application/json

--- request body ---
{"handle":"qa-f80a5bd260e2","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f8c28ba-5003-4017-881e-296913c1dd2e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8f8c28ba-5003-4017-881e-296913c1dd2e"}
```
