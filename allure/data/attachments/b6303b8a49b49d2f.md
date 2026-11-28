# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-6bfbf4fd-f68d-453e-a140-65fe7e0eb5b7` |
| 2 | `POST /v1/auth/token` | 200 | 32 | `qa-c3716018-7eff-45fd-8e85-a0f823430c5d` |
| 3 | `GET /v1/conversations/{id}` | 404 | 21 | `qa-2df49b19-0aea-4881-8fb6-451c1c8cd899` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-7af67726-29c2-4fe3-8c7e-dd8cdf752a83` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-dad6121e-9742-402e-81bf-6e604cf49042` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6bfbf4fd-f68d-453e-a140-65fe7e0eb5b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bfbf4fd-f68d-453e-a140-65fe7e0eb5b7
Content-Type: application/json

--- request body ---
{"handle":"qa-008319622064","displayName":"QA 008319622064","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bfbf4fd-f68d-453e-a140-65fe7e0eb5b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 6
Location: /v1/accounts/qa-008319622064
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e4bcd323-4d46-4bbd-aef0-2bcccc0e37e3","handle":"qa-008319622064","displayName":"QA 008319622064","region":"eu","role":"user","createdAt":"2026-11-28T10:37:26.220433648Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c3716018-7eff-45fd-8e85-a0f823430c5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3716018-7eff-45fd-8e85-a0f823430c5d
Content-Type: application/json

--- request body ---
{"handle":"qa-008319622064","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3716018-7eff-45fd-8e85-a0f823430c5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e4bcd323-4d46-4bbd-aef0-2bcccc0e37e3"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-2df49b19-0aea-4881-8fb6-451c1c8cd899

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2df49b19-0aea-4881-8fb6-451c1c8cd899
Content-Type: application/json

--- response: 404 in 21 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2df49b19-0aea-4881-8fb6-451c1c8cd899
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-2df49b19-0aea-4881-8fb6-451c1c8cd899"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7af67726-29c2-4fe3-8c7e-dd8cdf752a83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7af67726-29c2-4fe3-8c7e-dd8cdf752a83
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7af67726-29c2-4fe3-8c7e-dd8cdf752a83
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
correlation: qa-dad6121e-9742-402e-81bf-6e604cf49042

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dad6121e-9742-402e-81bf-6e604cf49042
Content-Type: application/json

--- request body ---
{"handle":"qa-008319622064","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dad6121e-9742-402e-81bf-6e604cf49042
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dad6121e-9742-402e-81bf-6e604cf49042"}
```
