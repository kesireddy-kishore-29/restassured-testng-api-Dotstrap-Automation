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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-357847ed-3e22-4acc-b1f0-17964b6fcf7e` |
| 2 | `POST /v1/auth/token` | 200 | 45 | `qa-0513aa8a-5105-4ad1-9020-dfa0f7fe473f` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 24 | `qa-8bf48887-dc25-4f6b-9a44-93224d3114ae` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-9cd7ad07-e8e1-4af6-b0ca-cca2a1f32379` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-048cc73e-93c5-4152-9e95-05d05773a71a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-357847ed-3e22-4acc-b1f0-17964b6fcf7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-357847ed-3e22-4acc-b1f0-17964b6fcf7e
Content-Type: application/json

--- request body ---
{"handle":"qa-1ee14ec4b9b7","displayName":"QA 1ee14ec4b9b7","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-357847ed-3e22-4acc-b1f0-17964b6fcf7e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 6
Location: /v1/accounts/qa-1ee14ec4b9b7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aff15e20-3f89-41e3-877c-4aaa348a7274","handle":"qa-1ee14ec4b9b7","displayName":"QA 1ee14ec4b9b7","region":"eu","role":"user","createdAt":"2026-11-01T09:23:24.342536266Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-0513aa8a-5105-4ad1-9020-dfa0f7fe473f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0513aa8a-5105-4ad1-9020-dfa0f7fe473f
Content-Type: application/json

--- request body ---
{"handle":"qa-1ee14ec4b9b7","password":"****"}

--- response: 200 in 45 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-0513aa8a-5105-4ad1-9020-dfa0f7fe473f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aff15e20-3f89-41e3-877c-4aaa348a7274"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-8bf48887-dc25-4f6b-9a44-93224d3114ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bf48887-dc25-4f6b-9a44-93224d3114ae
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 24 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8bf48887-dc25-4f6b-9a44-93224d3114ae
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-8bf48887-dc25-4f6b-9a44-93224d3114ae"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9cd7ad07-e8e1-4af6-b0ca-cca2a1f32379

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cd7ad07-e8e1-4af6-b0ca-cca2a1f32379
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9cd7ad07-e8e1-4af6-b0ca-cca2a1f32379
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
correlation: qa-048cc73e-93c5-4152-9e95-05d05773a71a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-048cc73e-93c5-4152-9e95-05d05773a71a
Content-Type: application/json

--- request body ---
{"handle":"qa-1ee14ec4b9b7","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-048cc73e-93c5-4152-9e95-05d05773a71a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-048cc73e-93c5-4152-9e95-05d05773a71a"}
```
