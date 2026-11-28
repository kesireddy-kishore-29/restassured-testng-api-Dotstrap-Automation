# Transcript: A normal account cannot use the admin endpoint

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#adminEndpointIsForbiddenToANormalAccount` |
| Features | FEAT-SEC-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 353 | `qa-c70e7048-27c6-48aa-829d-b51c4c9998dd` |
| 2 | `POST /v1/auth/token` | 200 | 56 | `qa-7c5ffc97-fb84-4be5-88d2-76360f1f2935` |
| 3 | `GET /v1/admin/stats` | 403 | 54 | `qa-736b0511-aec2-461a-8010-12249cbff30a` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-62b15d4c-245b-424f-8f4d-0c9d49bac152` |
| 5 | `POST /v1/auth/token` | 401 | 4 | `qa-8ce8b31b-c6a9-483a-8ba7-d726345b5b30` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c70e7048-27c6-48aa-829d-b51c4c9998dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c70e7048-27c6-48aa-829d-b51c4c9998dd
Content-Type: application/json

--- request body ---
{"handle":"qa-f0007c3a8c0e","displayName":"QA f0007c3a8c0e","password":"****","region":"eu"}

--- response: 201 in 353 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-c70e7048-27c6-48aa-829d-b51c4c9998dd
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
Location: /v1/accounts/qa-f0007c3a8c0e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_96c3a8ee-f985-4f37-8e61-c18520525759","handle":"qa-f0007c3a8c0e","displayName":"QA f0007c3a8c0e","region":"eu","role":"user","createdAt":"2026-11-23T10:55:00.747971087Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7c5ffc97-fb84-4be5-88d2-76360f1f2935

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c5ffc97-fb84-4be5-88d2-76360f1f2935
Content-Type: application/json

--- request body ---
{"handle":"qa-f0007c3a8c0e","password":"****"}

--- response: 200 in 56 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c5ffc97-fb84-4be5-88d2-76360f1f2935
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_96c3a8ee-f985-4f37-8e61-c18520525759"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-736b0511-aec2-461a-8010-12249cbff30a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-736b0511-aec2-461a-8010-12249cbff30a
Content-Type: application/json

--- response: 403 in 54 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-736b0511-aec2-461a-8010-12249cbff30a
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
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-736b0511-aec2-461a-8010-12249cbff30a"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-62b15d4c-245b-424f-8f4d-0c9d49bac152

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62b15d4c-245b-424f-8f4d-0c9d49bac152
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-62b15d4c-245b-424f-8f4d-0c9d49bac152
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
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-8ce8b31b-c6a9-483a-8ba7-d726345b5b30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ce8b31b-c6a9-483a-8ba7-d726345b5b30
Content-Type: application/json

--- request body ---
{"handle":"qa-f0007c3a8c0e","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ce8b31b-c6a9-483a-8ba7-d726345b5b30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8ce8b31b-c6a9-483a-8ba7-d726345b5b30"}
```
