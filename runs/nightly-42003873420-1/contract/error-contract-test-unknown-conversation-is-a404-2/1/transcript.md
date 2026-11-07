# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-f23f618b-f2e9-463d-9180-469aff340734` |
| 2 | `POST /v1/auth/token` | 200 | 23 | `qa-e25c1a3c-8ce8-4026-b696-6988415b5d36` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 13 | `qa-48d30277-5c31-4e3b-8716-de8df3d7545a` |
| 4 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-5a3a20a4-8790-462b-b32e-8044489c94e0` |
| 5 | `POST /v1/auth/token` | 401 | 4 | `qa-e84bf794-cb93-4cf1-87da-47486e4a2141` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f23f618b-f2e9-463d-9180-469aff340734

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f23f618b-f2e9-463d-9180-469aff340734
Content-Type: application/json

--- request body ---
{"handle":"qa-b19e821df275","displayName":"QA b19e821df275","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f23f618b-f2e9-463d-9180-469aff340734
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 6
Location: /v1/accounts/qa-b19e821df275
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f25a9860-6377-43d5-aa91-912ba13920a7","handle":"qa-b19e821df275","displayName":"QA b19e821df275","region":"eu","role":"user","createdAt":"2026-11-05T09:37:57.482034211Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e25c1a3c-8ce8-4026-b696-6988415b5d36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e25c1a3c-8ce8-4026-b696-6988415b5d36
Content-Type: application/json

--- request body ---
{"handle":"qa-b19e821df275","password":"****"}

--- response: 200 in 23 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-e25c1a3c-8ce8-4026-b696-6988415b5d36
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f25a9860-6377-43d5-aa91-912ba13920a7"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-48d30277-5c31-4e3b-8716-de8df3d7545a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48d30277-5c31-4e3b-8716-de8df3d7545a
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48d30277-5c31-4e3b-8716-de8df3d7545a
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
Content-Length: 262

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-48d30277-5c31-4e3b-8716-de8df3d7545a"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5a3a20a4-8790-462b-b32e-8044489c94e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a3a20a4-8790-462b-b32e-8044489c94e0
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5a3a20a4-8790-462b-b32e-8044489c94e0
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
correlation: qa-e84bf794-cb93-4cf1-87da-47486e4a2141

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e84bf794-cb93-4cf1-87da-47486e4a2141
Content-Type: application/json

--- request body ---
{"handle":"qa-b19e821df275","password":"****"}

--- response: 401 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e84bf794-cb93-4cf1-87da-47486e4a2141
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e84bf794-cb93-4cf1-87da-47486e4a2141"}
```
