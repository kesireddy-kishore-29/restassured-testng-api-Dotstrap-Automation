# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-4c687670-2dc4-4b64-9405-75df3326c800` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-9389eaa6-82bc-45f9-9c6a-c5a1394d38d3` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-2b4f1e2d-dfe9-4824-b90c-d9b71fe3804a` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-c05ad81b-325b-419d-b593-8c8ae7952790` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 48 | `qa-5fd3794e-a21c-4237-a066-7cb79513a6f3` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-3984819a-6fd8-4eaf-aa36-9e0a37923b96` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-536e7b1a-a6ec-4033-a52f-47d30f18e149` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-fc454cbd-49e8-448c-94f1-89e787ff2f73` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-b746ee49-1600-4363-9cb5-d9fd2617c046` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-16d3be1f-e203-417e-93d3-4391b9124bcb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4c687670-2dc4-4b64-9405-75df3326c800

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c687670-2dc4-4b64-9405-75df3326c800
Content-Type: application/json

--- request body ---
{"handle":"qa-dc24e0451273","displayName":"QA dc24e0451273","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c687670-2dc4-4b64-9405-75df3326c800
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 7
Location: /v1/accounts/qa-dc24e0451273
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8bc2bff9-cc96-4761-9705-48ca86c56570","handle":"qa-dc24e0451273","displayName":"QA dc24e0451273","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.784174972Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9389eaa6-82bc-45f9-9c6a-c5a1394d38d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9389eaa6-82bc-45f9-9c6a-c5a1394d38d3
Content-Type: application/json

--- request body ---
{"handle":"qa-16eca291c206","displayName":"QA 16eca291c206","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-9389eaa6-82bc-45f9-9c6a-c5a1394d38d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 7
Location: /v1/accounts/qa-16eca291c206
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ae9b8d13-20a7-445a-b998-1f5d9e8d8780","handle":"qa-16eca291c206","displayName":"QA 16eca291c206","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.837344678Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2b4f1e2d-dfe9-4824-b90c-d9b71fe3804a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b4f1e2d-dfe9-4824-b90c-d9b71fe3804a
Content-Type: application/json

--- request body ---
{"handle":"qa-dc24e0451273","password":"****"}

--- response: 200 in 38 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b4f1e2d-dfe9-4824-b90c-d9b71fe3804a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8bc2bff9-cc96-4761-9705-48ca86c56570"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c05ad81b-325b-419d-b593-8c8ae7952790

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c05ad81b-325b-419d-b593-8c8ae7952790
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-16eca291c206","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-c05ad81b-325b-419d-b593-8c8ae7952790
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
Location: /v1/conversations/cnv_cd5b18e1-f481-4b6d-8fab-bb012c0eddaf
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cd5b18e1-f481-4b6d-8fab-bb012c0eddaf","subject":"Error contract","status":"open","region":"eu","participants":["qa-dc24e0451273","qa-16eca291c206"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:35.938694582Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_cd5b18e1-f481-4b6d-8fab-bb012c0eddaf/read
correlation: qa-5fd3794e-a21c-4237-a066-7cb79513a6f3

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 13a17018-79ec-477b-9203-2966feda8bc9
X-Correlation-Id: qa-5fd3794e-a21c-4237-a066-7cb79513a6f3
Content-Type: application/json

--- response: 503 in 48 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5fd3794e-a21c-4237-a066-7cb79513a6f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_cd5b18e1-f481-4b6d-8fab-bb012c0eddaf/read","correlationId":"qa-5fd3794e-a21c-4237-a066-7cb79513a6f3"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3984819a-6fd8-4eaf-aa36-9e0a37923b96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3984819a-6fd8-4eaf-aa36-9e0a37923b96
Content-Type: application/json

--- request body ---
{"handle":"qa-16eca291c206","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-3984819a-6fd8-4eaf-aa36-9e0a37923b96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ae9b8d13-20a7-445a-b998-1f5d9e8d8780"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-536e7b1a-a6ec-4033-a52f-47d30f18e149

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-536e7b1a-a6ec-4033-a52f-47d30f18e149
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-536e7b1a-a6ec-4033-a52f-47d30f18e149
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-fc454cbd-49e8-448c-94f1-89e787ff2f73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc454cbd-49e8-448c-94f1-89e787ff2f73
Content-Type: application/json

--- request body ---
{"handle":"qa-16eca291c206","password":"****"}

--- response: 401 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fc454cbd-49e8-448c-94f1-89e787ff2f73
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fc454cbd-49e8-448c-94f1-89e787ff2f73"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b746ee49-1600-4363-9cb5-d9fd2617c046

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b746ee49-1600-4363-9cb5-d9fd2617c046
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b746ee49-1600-4363-9cb5-d9fd2617c046
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-16d3be1f-e203-417e-93d3-4391b9124bcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16d3be1f-e203-417e-93d3-4391b9124bcb
Content-Type: application/json

--- request body ---
{"handle":"qa-dc24e0451273","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-16d3be1f-e203-417e-93d3-4391b9124bcb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-16d3be1f-e203-417e-93d3-4391b9124bcb"}
```
