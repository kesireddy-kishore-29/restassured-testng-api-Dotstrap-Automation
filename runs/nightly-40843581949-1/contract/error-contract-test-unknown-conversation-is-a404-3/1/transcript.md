# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-e2e32ef7-17e2-450b-bfb0-2a5bc5074068` |
| 2 | `POST /v1/auth/token` | 200 | 38 | `qa-3d19a060-c93c-4cef-bdad-27709a1ecd77` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 42 | `qa-7523a9a1-69fa-4d38-9c9b-0473188b6713` |
| 4 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-883c7536-3b45-41c8-a761-957f3fc92643` |
| 5 | `POST /v1/auth/token` | 401 | 16 | `qa-0d889766-78e2-4a41-8a1a-39086881c6df` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e2e32ef7-17e2-450b-bfb0-2a5bc5074068

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2e32ef7-17e2-450b-bfb0-2a5bc5074068
Content-Type: application/json

--- request body ---
{"handle":"qa-dec87e0cb5bb","displayName":"QA dec87e0cb5bb","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2e32ef7-17e2-450b-bfb0-2a5bc5074068
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 6
Location: /v1/accounts/qa-dec87e0cb5bb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_09938070-0053-4f44-92f5-d407f650894d","handle":"qa-dec87e0cb5bb","displayName":"QA dec87e0cb5bb","region":"eu","role":"user","createdAt":"2026-10-29T08:39:01.782724198Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3d19a060-c93c-4cef-bdad-27709a1ecd77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d19a060-c93c-4cef-bdad-27709a1ecd77
Content-Type: application/json

--- request body ---
{"handle":"qa-dec87e0cb5bb","password":"****"}

--- response: 200 in 38 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d19a060-c93c-4cef-bdad-27709a1ecd77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_09938070-0053-4f44-92f5-d407f650894d"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-7523a9a1-69fa-4d38-9c9b-0473188b6713

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7523a9a1-69fa-4d38-9c9b-0473188b6713
Content-Type: application/json

--- response: 404 in 42 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7523a9a1-69fa-4d38-9c9b-0473188b6713
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
Content-Length: 258

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-7523a9a1-69fa-4d38-9c9b-0473188b6713"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-883c7536-3b45-41c8-a761-957f3fc92643

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-883c7536-3b45-41c8-a761-957f3fc92643
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-883c7536-3b45-41c8-a761-957f3fc92643
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
correlation: qa-0d889766-78e2-4a41-8a1a-39086881c6df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d889766-78e2-4a41-8a1a-39086881c6df
Content-Type: application/json

--- request body ---
{"handle":"qa-dec87e0cb5bb","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0d889766-78e2-4a41-8a1a-39086881c6df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0d889766-78e2-4a41-8a1a-39086881c6df"}
```
