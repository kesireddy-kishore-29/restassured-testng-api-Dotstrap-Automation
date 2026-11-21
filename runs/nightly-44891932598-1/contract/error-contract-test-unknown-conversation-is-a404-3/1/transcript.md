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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-ceb664da-0214-4c88-a054-d19b33dc35ac` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-304516f8-cf2b-4269-aebd-539d55b9b75a` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 12 | `qa-950e5842-38e3-489f-8589-ce054ae5a17d` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-5eb07c3e-ffcc-470f-a2f8-81097e1f5d11` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-0e1290d4-f7de-4743-955d-7e7d1fda2e24` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ceb664da-0214-4c88-a054-d19b33dc35ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ceb664da-0214-4c88-a054-d19b33dc35ac
Content-Type: application/json

--- request body ---
{"handle":"qa-ce0d5afbc5b8","displayName":"QA ce0d5afbc5b8","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-ceb664da-0214-4c88-a054-d19b33dc35ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 5
Location: /v1/accounts/qa-ce0d5afbc5b8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_af699073-1afb-4f95-b1f5-279ce0d38229","handle":"qa-ce0d5afbc5b8","displayName":"QA ce0d5afbc5b8","region":"eu","role":"user","createdAt":"2026-11-21T09:57:13.188661570Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-304516f8-cf2b-4269-aebd-539d55b9b75a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-304516f8-cf2b-4269-aebd-539d55b9b75a
Content-Type: application/json

--- request body ---
{"handle":"qa-ce0d5afbc5b8","password":"****"}

--- response: 200 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-304516f8-cf2b-4269-aebd-539d55b9b75a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_af699073-1afb-4f95-b1f5-279ce0d38229"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-950e5842-38e3-489f-8589-ce054ae5a17d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-950e5842-38e3-489f-8589-ce054ae5a17d
Content-Type: application/json

--- response: 404 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-950e5842-38e3-489f-8589-ce054ae5a17d
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-950e5842-38e3-489f-8589-ce054ae5a17d"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5eb07c3e-ffcc-470f-a2f8-81097e1f5d11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5eb07c3e-ffcc-470f-a2f8-81097e1f5d11
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5eb07c3e-ffcc-470f-a2f8-81097e1f5d11
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
correlation: qa-0e1290d4-f7de-4743-955d-7e7d1fda2e24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e1290d4-f7de-4743-955d-7e7d1fda2e24
Content-Type: application/json

--- request body ---
{"handle":"qa-ce0d5afbc5b8","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e1290d4-f7de-4743-955d-7e7d1fda2e24
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0e1290d4-f7de-4743-955d-7e7d1fda2e24"}
```
