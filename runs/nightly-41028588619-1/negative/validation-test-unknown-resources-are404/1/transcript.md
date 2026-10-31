# Transcript: Unknown conversations and handles are 404 problems

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#unknownResourcesAre404` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-4e251ee8-fc96-4647-b96b-f8f5163fdad5` |
| 2 | `POST /v1/auth/token` | 200 | 14 | `qa-2bd32af8-de97-40e5-b6ff-acbcb7f0db2d` |
| 3 | `GET /v1/conversations/{id}` | 404 | 7 | `qa-a0c35f6b-4a2a-4e5c-8aeb-2052228cfc17` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 11 | `qa-7fa9e4e9-adf8-4d16-87c2-5d40b7203a0c` |
| 5 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-e8bc8822-6139-4639-943c-050389b3670f` |
| 6 | `POST /v1/auth/token` | 401 | 4 | `qa-db0d568e-1546-4ae4-9046-190bdc853f96` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4e251ee8-fc96-4647-b96b-f8f5163fdad5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e251ee8-fc96-4647-b96b-f8f5163fdad5
Content-Type: application/json

--- request body ---
{"handle":"qa-64c7d622bea4","displayName":"QA 64c7d622bea4","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e251ee8-fc96-4647-b96b-f8f5163fdad5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Location: /v1/accounts/qa-64c7d622bea4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_16e1c5ac-9328-4536-b4e6-439d58d40c22","handle":"qa-64c7d622bea4","displayName":"QA 64c7d622bea4","region":"eu","role":"user","createdAt":"2026-10-30T08:45:49.815768489Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2bd32af8-de97-40e5-b6ff-acbcb7f0db2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bd32af8-de97-40e5-b6ff-acbcb7f0db2d
Content-Type: application/json

--- request body ---
{"handle":"qa-64c7d622bea4","password":"****"}

--- response: 200 in 14 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bd32af8-de97-40e5-b6ff-acbcb7f0db2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_16e1c5ac-9328-4536-b4e6-439d58d40c22"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-a0c35f6b-4a2a-4e5c-8aeb-2052228cfc17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0c35f6b-4a2a-4e5c-8aeb-2052228cfc17
Content-Type: application/json

--- response: 404 in 7 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a0c35f6b-4a2a-4e5c-8aeb-2052228cfc17
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-a0c35f6b-4a2a-4e5c-8aeb-2052228cfc17"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-7fa9e4e9-adf8-4d16-87c2-5d40b7203a0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fa9e4e9-adf8-4d16-87c2-5d40b7203a0c
Content-Type: application/json

--- response: 404 in 11 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7fa9e4e9-adf8-4d16-87c2-5d40b7203a0c
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
Content-Length: 247

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-7fa9e4e9-adf8-4d16-87c2-5d40b7203a0c"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e8bc8822-6139-4639-943c-050389b3670f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8bc8822-6139-4639-943c-050389b3670f
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e8bc8822-6139-4639-943c-050389b3670f
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
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-db0d568e-1546-4ae4-9046-190bdc853f96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db0d568e-1546-4ae4-9046-190bdc853f96
Content-Type: application/json

--- request body ---
{"handle":"qa-64c7d622bea4","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db0d568e-1546-4ae4-9046-190bdc853f96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-db0d568e-1546-4ae4-9046-190bdc853f96"}
```
