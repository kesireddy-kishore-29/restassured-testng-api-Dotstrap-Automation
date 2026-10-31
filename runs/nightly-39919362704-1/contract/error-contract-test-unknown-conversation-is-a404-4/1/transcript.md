# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-7e5d3d2e-2c1a-47a6-8f2a-17a69bf1c881` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-630fc3cd-d300-4180-a696-f5b7b0ccbd20` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 14 | `qa-297c4039-7215-4fcb-8ab2-14d6885f82b6` |
| 4 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-58edb69b-0bea-4c5e-8407-5eb20a29a62b` |
| 5 | `POST /v1/auth/token` | 401 | 35 | `qa-55aa116a-28f0-46d2-90d3-b427141a4283` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7e5d3d2e-2c1a-47a6-8f2a-17a69bf1c881

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e5d3d2e-2c1a-47a6-8f2a-17a69bf1c881
Content-Type: application/json

--- request body ---
{"handle":"qa-26376c3df0e9","displayName":"QA 26376c3df0e9","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e5d3d2e-2c1a-47a6-8f2a-17a69bf1c881
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
Location: /v1/accounts/qa-26376c3df0e9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_621088f9-4d29-4974-8fcd-97beaa9f92f9","handle":"qa-26376c3df0e9","displayName":"QA 26376c3df0e9","region":"eu","role":"user","createdAt":"2026-10-23T07:41:47.881939419Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-630fc3cd-d300-4180-a696-f5b7b0ccbd20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-630fc3cd-d300-4180-a696-f5b7b0ccbd20
Content-Type: application/json

--- request body ---
{"handle":"qa-26376c3df0e9","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-630fc3cd-d300-4180-a696-f5b7b0ccbd20
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_621088f9-4d29-4974-8fcd-97beaa9f92f9"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-297c4039-7215-4fcb-8ab2-14d6885f82b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-297c4039-7215-4fcb-8ab2-14d6885f82b6
Content-Type: application/json

--- response: 404 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-297c4039-7215-4fcb-8ab2-14d6885f82b6
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
Content-Length: 259

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-297c4039-7215-4fcb-8ab2-14d6885f82b6"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-58edb69b-0bea-4c5e-8407-5eb20a29a62b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58edb69b-0bea-4c5e-8407-5eb20a29a62b
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-58edb69b-0bea-4c5e-8407-5eb20a29a62b
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
correlation: qa-55aa116a-28f0-46d2-90d3-b427141a4283

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55aa116a-28f0-46d2-90d3-b427141a4283
Content-Type: application/json

--- request body ---
{"handle":"qa-26376c3df0e9","password":"****"}

--- response: 401 in 35 ms ---
Date: Fri, 23 Oct 2026 07:41:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-55aa116a-28f0-46d2-90d3-b427141a4283
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-55aa116a-28f0-46d2-90d3-b427141a4283"}
```
