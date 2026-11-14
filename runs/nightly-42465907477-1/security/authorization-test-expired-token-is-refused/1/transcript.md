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
| 1 | `POST /v1/accounts` | 201 | 350 | `qa-5da1dbc7-0df5-44eb-8b16-56d6c8efa289` |
| 2 | `POST /v1/auth/token` | 200 | 33 | `qa-d2db6075-70f8-4241-9cf5-4b0c26bba7d1` |
| 3 | `GET /v1/accounts/me` | 200 | 13 | `qa-3b811dad-bff5-4444-a322-97cc8d8d5ff9` |
| 4 | `GET /v1/accounts/me` | 200 | 15 | `qa-96349038-52ba-4332-92f1-17adebf20d38` |
| 5 | `GET /v1/accounts/me` | 200 | 8 | `qa-012d644c-16c0-4a09-bace-c928b94ee883` |
| 6 | `GET /v1/accounts/me` | 401 | 11 | `qa-06eacade-b936-49cc-bb11-20a6004dbe2e` |
| 7 | `GET /v1/accounts/me` | 401 | 9 | `qa-6ea7dde3-ddc7-4434-a364-680214093556` |
| 8 | `POST /v1/auth/token` | 200 | 8 | `qa-9a30af41-9dd4-4133-beff-bbc156409466` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-cf8e40a6-bc3a-49a2-8f55-e7f62074fad4` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-b833d99e-cfda-4b72-822e-1a45a1971f20` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5da1dbc7-0df5-44eb-8b16-56d6c8efa289

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5da1dbc7-0df5-44eb-8b16-56d6c8efa289
Content-Type: application/json

--- request body ---
{"handle":"qa-bcf37a265e14","displayName":"QA bcf37a265e14","password":"****","region":"eu"}

--- response: 201 in 350 ms ---
Date: Sun, 08 Nov 2026 09:09:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-5da1dbc7-0df5-44eb-8b16-56d6c8efa289
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
Location: /v1/accounts/qa-bcf37a265e14
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6a0d3e6-bbd5-4fce-8280-5702d92d1a75","handle":"qa-bcf37a265e14","displayName":"QA bcf37a265e14","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.802408550Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d2db6075-70f8-4241-9cf5-4b0c26bba7d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2db6075-70f8-4241-9cf5-4b0c26bba7d1
Content-Type: application/json

--- request body ---
{"handle":"qa-bcf37a265e14","password":"****","ttlSeconds":1}

--- response: 200 in 33 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2db6075-70f8-4241-9cf5-4b0c26bba7d1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_c6a0d3e6-bbd5-4fce-8280-5702d92d1a75"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-3b811dad-bff5-4444-a322-97cc8d8d5ff9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b811dad-bff5-4444-a322-97cc8d8d5ff9
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b811dad-bff5-4444-a322-97cc8d8d5ff9
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

{"id":"acc_c6a0d3e6-bbd5-4fce-8280-5702d92d1a75","handle":"qa-bcf37a265e14","displayName":"QA bcf37a265e14","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.802408550Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-96349038-52ba-4332-92f1-17adebf20d38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96349038-52ba-4332-92f1-17adebf20d38
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-96349038-52ba-4332-92f1-17adebf20d38
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

{"id":"acc_c6a0d3e6-bbd5-4fce-8280-5702d92d1a75","handle":"qa-bcf37a265e14","displayName":"QA bcf37a265e14","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.802408550Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-012d644c-16c0-4a09-bace-c928b94ee883

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-012d644c-16c0-4a09-bace-c928b94ee883
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-012d644c-16c0-4a09-bace-c928b94ee883
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

{"id":"acc_c6a0d3e6-bbd5-4fce-8280-5702d92d1a75","handle":"qa-bcf37a265e14","displayName":"QA bcf37a265e14","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.802408550Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-06eacade-b936-49cc-bb11-20a6004dbe2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06eacade-b936-49cc-bb11-20a6004dbe2e
Content-Type: application/json

--- response: 401 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-06eacade-b936-49cc-bb11-20a6004dbe2e
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-06eacade-b936-49cc-bb11-20a6004dbe2e"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-6ea7dde3-ddc7-4434-a364-680214093556

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ea7dde3-ddc7-4434-a364-680214093556
Content-Type: application/json

--- response: 401 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ea7dde3-ddc7-4434-a364-680214093556
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-6ea7dde3-ddc7-4434-a364-680214093556"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-9a30af41-9dd4-4133-beff-bbc156409466

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a30af41-9dd4-4133-beff-bbc156409466
Content-Type: application/json

--- request body ---
{"handle":"qa-bcf37a265e14","password":"****"}

--- response: 200 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a30af41-9dd4-4133-beff-bbc156409466
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c6a0d3e6-bbd5-4fce-8280-5702d92d1a75"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cf8e40a6-bc3a-49a2-8f55-e7f62074fad4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf8e40a6-bc3a-49a2-8f55-e7f62074fad4
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cf8e40a6-bc3a-49a2-8f55-e7f62074fad4
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
correlation: qa-b833d99e-cfda-4b72-822e-1a45a1971f20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b833d99e-cfda-4b72-822e-1a45a1971f20
Content-Type: application/json

--- request body ---
{"handle":"qa-bcf37a265e14","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b833d99e-cfda-4b72-822e-1a45a1971f20
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b833d99e-cfda-4b72-822e-1a45a1971f20"}
```
