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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-262bd2da-cde6-411b-bc60-79667accea6f` |
| 2 | `POST /v1/auth/token` | 200 | 29 | `qa-99074aff-742d-45b4-aaf9-4c262298b103` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 24 | `qa-09831e16-9f57-4faf-bfb0-d1c0ac2beff6` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-5246b8e1-95a7-433b-9d37-f1272e12d2dc` |
| 5 | `POST /v1/auth/token` | 401 | 15 | `qa-84dc46f0-cd2c-4f20-b3e0-3bc05004911d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-262bd2da-cde6-411b-bc60-79667accea6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-262bd2da-cde6-411b-bc60-79667accea6f
Content-Type: application/json

--- request body ---
{"handle":"qa-32842a520666","displayName":"QA 32842a520666","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-262bd2da-cde6-411b-bc60-79667accea6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 6
Location: /v1/accounts/qa-32842a520666
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fbf69b58-c028-49a4-b430-7182cf770df6","handle":"qa-32842a520666","displayName":"QA 32842a520666","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.179694023Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-99074aff-742d-45b4-aaf9-4c262298b103

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99074aff-742d-45b4-aaf9-4c262298b103
Content-Type: application/json

--- request body ---
{"handle":"qa-32842a520666","password":"****"}

--- response: 200 in 29 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-99074aff-742d-45b4-aaf9-4c262298b103
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fbf69b58-c028-49a4-b430-7182cf770df6"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-09831e16-9f57-4faf-bfb0-d1c0ac2beff6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09831e16-9f57-4faf-bfb0-d1c0ac2beff6
Content-Type: application/json

--- response: 404 in 24 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09831e16-9f57-4faf-bfb0-d1c0ac2beff6
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-09831e16-9f57-4faf-bfb0-d1c0ac2beff6"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5246b8e1-95a7-433b-9d37-f1272e12d2dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5246b8e1-95a7-433b-9d37-f1272e12d2dc
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5246b8e1-95a7-433b-9d37-f1272e12d2dc
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
correlation: qa-84dc46f0-cd2c-4f20-b3e0-3bc05004911d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84dc46f0-cd2c-4f20-b3e0-3bc05004911d
Content-Type: application/json

--- request body ---
{"handle":"qa-32842a520666","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84dc46f0-cd2c-4f20-b3e0-3bc05004911d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-84dc46f0-cd2c-4f20-b3e0-3bc05004911d"}
```
