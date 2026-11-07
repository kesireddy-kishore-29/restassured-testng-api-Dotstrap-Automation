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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-c3d0238f-bf35-479c-ba61-7e2a8b58924b` |
| 2 | `POST /v1/auth/token` | 200 | 7 | `qa-96af1d81-abcd-442f-9444-05faead32c3f` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 17 | `qa-c4c04949-a2d1-4d73-94e4-e0a84821ee7c` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-1616e71e-f4cb-48a0-bc17-cf2ee968ce6b` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-8da59a60-d71d-4ee4-bec2-5e64cc48f963` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c3d0238f-bf35-479c-ba61-7e2a8b58924b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3d0238f-bf35-479c-ba61-7e2a8b58924b
Content-Type: application/json

--- request body ---
{"handle":"qa-c259f5589927","displayName":"QA c259f5589927","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3d0238f-bf35-479c-ba61-7e2a8b58924b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 8
Location: /v1/accounts/qa-c259f5589927
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c192d10c-fa55-41fb-9a79-bffecbc197f4","handle":"qa-c259f5589927","displayName":"QA c259f5589927","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.739190602Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-96af1d81-abcd-442f-9444-05faead32c3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96af1d81-abcd-442f-9444-05faead32c3f
Content-Type: application/json

--- request body ---
{"handle":"qa-c259f5589927","password":"****"}

--- response: 200 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-96af1d81-abcd-442f-9444-05faead32c3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c192d10c-fa55-41fb-9a79-bffecbc197f4"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-c4c04949-a2d1-4d73-94e4-e0a84821ee7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4c04949-a2d1-4d73-94e4-e0a84821ee7c
Content-Type: application/json

--- response: 404 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c4c04949-a2d1-4d73-94e4-e0a84821ee7c
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-c4c04949-a2d1-4d73-94e4-e0a84821ee7c"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1616e71e-f4cb-48a0-bc17-cf2ee968ce6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1616e71e-f4cb-48a0-bc17-cf2ee968ce6b
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1616e71e-f4cb-48a0-bc17-cf2ee968ce6b
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
correlation: qa-8da59a60-d71d-4ee4-bec2-5e64cc48f963

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8da59a60-d71d-4ee4-bec2-5e64cc48f963
Content-Type: application/json

--- request body ---
{"handle":"qa-c259f5589927","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8da59a60-d71d-4ee4-bec2-5e64cc48f963
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8da59a60-d71d-4ee4-bec2-5e64cc48f963"}
```
