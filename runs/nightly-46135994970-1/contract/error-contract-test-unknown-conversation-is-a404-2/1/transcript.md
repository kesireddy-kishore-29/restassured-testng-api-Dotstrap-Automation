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
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-215d12a7-d843-4793-a38c-abe42b428e0a` |
| 2 | `POST /v1/auth/token` | 200 | 32 | `qa-5af8dc1c-ea1b-4382-9f1f-29dadd80fea7` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 20 | `qa-6388e60d-6f92-44d5-bbf3-ca973e75e34f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-5e707d40-39e2-4789-ac5f-7eec77f1a4e9` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-4faa2cbc-7aca-4779-83a5-a692d15b3134` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-215d12a7-d843-4793-a38c-abe42b428e0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-215d12a7-d843-4793-a38c-abe42b428e0a
Content-Type: application/json

--- request body ---
{"handle":"qa-19ce8f256b28","displayName":"QA 19ce8f256b28","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-215d12a7-d843-4793-a38c-abe42b428e0a
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
Location: /v1/accounts/qa-19ce8f256b28
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d5559ab6-8757-4641-ac9e-007ccd83b9bb","handle":"qa-19ce8f256b28","displayName":"QA 19ce8f256b28","region":"eu","role":"user","createdAt":"2026-11-28T10:37:26.229165333Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5af8dc1c-ea1b-4382-9f1f-29dadd80fea7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5af8dc1c-ea1b-4382-9f1f-29dadd80fea7
Content-Type: application/json

--- request body ---
{"handle":"qa-19ce8f256b28","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-5af8dc1c-ea1b-4382-9f1f-29dadd80fea7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d5559ab6-8757-4641-ac9e-007ccd83b9bb"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-6388e60d-6f92-44d5-bbf3-ca973e75e34f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6388e60d-6f92-44d5-bbf3-ca973e75e34f
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 20 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6388e60d-6f92-44d5-bbf3-ca973e75e34f
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-6388e60d-6f92-44d5-bbf3-ca973e75e34f"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5e707d40-39e2-4789-ac5f-7eec77f1a4e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e707d40-39e2-4789-ac5f-7eec77f1a4e9
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5e707d40-39e2-4789-ac5f-7eec77f1a4e9
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
correlation: qa-4faa2cbc-7aca-4779-83a5-a692d15b3134

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4faa2cbc-7aca-4779-83a5-a692d15b3134
Content-Type: application/json

--- request body ---
{"handle":"qa-19ce8f256b28","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4faa2cbc-7aca-4779-83a5-a692d15b3134
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4faa2cbc-7aca-4779-83a5-a692d15b3134"}
```
