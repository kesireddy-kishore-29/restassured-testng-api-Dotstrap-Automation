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
| 1 | `POST /v1/accounts` | 201 | 347 | `qa-8ed1f41c-3de7-4038-8158-c613ccc72adf` |
| 2 | `POST /v1/auth/token` | 200 | 57 | `qa-37cf7f7c-b40c-46dd-9315-fa6a4b6da74c` |
| 3 | `GET /v1/accounts/me` | 200 | 11 | `qa-147382dc-1291-4e2a-aa77-a7d357cffc7c` |
| 4 | `GET /v1/accounts/me` | 200 | 9 | `qa-ff6c35f3-2cde-44d6-b415-08f6b12596f5` |
| 5 | `GET /v1/accounts/me` | 200 | 8 | `qa-ff0651fb-144c-4bb0-bea7-e2ed62dd0da1` |
| 6 | `GET /v1/accounts/me` | 401 | 6 | `qa-f1280da1-4bc5-4fbc-b1b6-ae6322c0eb4a` |
| 7 | `GET /v1/accounts/me` | 401 | 6 | `qa-5611f35a-8392-4a7f-943f-055ed9e34f02` |
| 8 | `POST /v1/auth/token` | 200 | 10 | `qa-a0dc2e73-8aa4-4c09-b111-9f76bc6a2de4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-d89d1bea-cd47-423e-be64-df3f9d860827` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-d1b11f49-e162-4ca5-af1c-4df1fc6e43ae` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8ed1f41c-3de7-4038-8158-c613ccc72adf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ed1f41c-3de7-4038-8158-c613ccc72adf
Content-Type: application/json

--- request body ---
{"handle":"qa-95d80449e9e8","displayName":"QA 95d80449e9e8","password":"****","region":"eu"}

--- response: 201 in 347 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ed1f41c-3de7-4038-8158-c613ccc72adf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-95d80449e9e8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9b167e1-c853-46af-a7ed-ec4bafca8cdc","handle":"qa-95d80449e9e8","displayName":"QA 95d80449e9e8","region":"eu","role":"user","createdAt":"2026-11-23T10:55:00.754449476Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-37cf7f7c-b40c-46dd-9315-fa6a4b6da74c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37cf7f7c-b40c-46dd-9315-fa6a4b6da74c
Content-Type: application/json

--- request body ---
{"handle":"qa-95d80449e9e8","password":"****","ttlSeconds":1}

--- response: 200 in 57 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-37cf7f7c-b40c-46dd-9315-fa6a4b6da74c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_e9b167e1-c853-46af-a7ed-ec4bafca8cdc"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-147382dc-1291-4e2a-aa77-a7d357cffc7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-147382dc-1291-4e2a-aa77-a7d357cffc7c
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-147382dc-1291-4e2a-aa77-a7d357cffc7c
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

{"id":"acc_e9b167e1-c853-46af-a7ed-ec4bafca8cdc","handle":"qa-95d80449e9e8","displayName":"QA 95d80449e9e8","region":"eu","role":"user","createdAt":"2026-11-23T10:55:00.754449476Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-ff6c35f3-2cde-44d6-b415-08f6b12596f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff6c35f3-2cde-44d6-b415-08f6b12596f5
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff6c35f3-2cde-44d6-b415-08f6b12596f5
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

{"id":"acc_e9b167e1-c853-46af-a7ed-ec4bafca8cdc","handle":"qa-95d80449e9e8","displayName":"QA 95d80449e9e8","region":"eu","role":"user","createdAt":"2026-11-23T10:55:00.754449476Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-ff0651fb-144c-4bb0-bea7-e2ed62dd0da1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff0651fb-144c-4bb0-bea7-e2ed62dd0da1
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff0651fb-144c-4bb0-bea7-e2ed62dd0da1
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

{"id":"acc_e9b167e1-c853-46af-a7ed-ec4bafca8cdc","handle":"qa-95d80449e9e8","displayName":"QA 95d80449e9e8","region":"eu","role":"user","createdAt":"2026-11-23T10:55:00.754449476Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-f1280da1-4bc5-4fbc-b1b6-ae6322c0eb4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1280da1-4bc5-4fbc-b1b6-ae6322c0eb4a
Content-Type: application/json

--- response: 401 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f1280da1-4bc5-4fbc-b1b6-ae6322c0eb4a
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-f1280da1-4bc5-4fbc-b1b6-ae6322c0eb4a"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-5611f35a-8392-4a7f-943f-055ed9e34f02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5611f35a-8392-4a7f-943f-055ed9e34f02
Content-Type: application/json

--- response: 401 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5611f35a-8392-4a7f-943f-055ed9e34f02
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-5611f35a-8392-4a7f-943f-055ed9e34f02"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-a0dc2e73-8aa4-4c09-b111-9f76bc6a2de4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0dc2e73-8aa4-4c09-b111-9f76bc6a2de4
Content-Type: application/json

--- request body ---
{"handle":"qa-95d80449e9e8","password":"****"}

--- response: 200 in 10 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0dc2e73-8aa4-4c09-b111-9f76bc6a2de4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e9b167e1-c853-46af-a7ed-ec4bafca8cdc"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d89d1bea-cd47-423e-be64-df3f9d860827

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d89d1bea-cd47-423e-be64-df3f9d860827
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d89d1bea-cd47-423e-be64-df3f9d860827
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
correlation: qa-d1b11f49-e162-4ca5-af1c-4df1fc6e43ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1b11f49-e162-4ca5-af1c-4df1fc6e43ae
Content-Type: application/json

--- request body ---
{"handle":"qa-95d80449e9e8","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d1b11f49-e162-4ca5-af1c-4df1fc6e43ae
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d1b11f49-e162-4ca5-af1c-4df1fc6e43ae"}
```
