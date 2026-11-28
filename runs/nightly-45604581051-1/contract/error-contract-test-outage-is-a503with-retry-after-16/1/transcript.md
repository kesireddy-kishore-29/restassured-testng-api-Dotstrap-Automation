# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-a15db50a-a68f-4ff5-ba0e-34fcc956f2ac` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-78809b8a-d435-4e00-8050-81be749a2c53` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-d5931e4d-cd95-4aff-93ab-6c946d045cac` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-251f96ac-b51c-412c-a36b-6627cefa2925` |
| 5 | `GET /v1/admin/stats` | 503 | 10 | `qa-66335095-3e32-4ab9-8185-aa7617085ce1` |
| 6 | `POST /v1/auth/token` | 200 | 9 | `qa-943ad541-00c5-4631-8323-3b952d4a5436` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-141f1d24-5635-4827-9ca5-89ef376965aa` |
| 8 | `POST /v1/auth/token` | 401 | 4 | `qa-43b90938-affa-4bfd-a2a4-99f365e513f3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-ae0eaa75-791b-41cf-b88d-8b6609368edc` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-9769cca1-90bd-4fd8-986a-7f7751c8894b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a15db50a-a68f-4ff5-ba0e-34fcc956f2ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a15db50a-a68f-4ff5-ba0e-34fcc956f2ac
Content-Type: application/json

--- request body ---
{"handle":"qa-bbc3076529c1","displayName":"QA bbc3076529c1","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a15db50a-a68f-4ff5-ba0e-34fcc956f2ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 7
Location: /v1/accounts/qa-bbc3076529c1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8139fae8-6e1b-49a1-a3fe-051cbc7963de","handle":"qa-bbc3076529c1","displayName":"QA bbc3076529c1","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.450072703Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-78809b8a-d435-4e00-8050-81be749a2c53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78809b8a-d435-4e00-8050-81be749a2c53
Content-Type: application/json

--- request body ---
{"handle":"qa-504e8929f784","displayName":"QA 504e8929f784","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-78809b8a-d435-4e00-8050-81be749a2c53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 7
Location: /v1/accounts/qa-504e8929f784
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1a6d6d15-dfc2-44f7-a196-2e939313ab80","handle":"qa-504e8929f784","displayName":"QA 504e8929f784","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.486755114Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d5931e4d-cd95-4aff-93ab-6c946d045cac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5931e4d-cd95-4aff-93ab-6c946d045cac
Content-Type: application/json

--- request body ---
{"handle":"qa-bbc3076529c1","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5931e4d-cd95-4aff-93ab-6c946d045cac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8139fae8-6e1b-49a1-a3fe-051cbc7963de"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-251f96ac-b51c-412c-a36b-6627cefa2925

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-251f96ac-b51c-412c-a36b-6627cefa2925
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-504e8929f784","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-251f96ac-b51c-412c-a36b-6627cefa2925
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
Location: /v1/conversations/cnv_d1baeea6-1cf8-437c-8c39-5f1fc9efa3dd
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d1baeea6-1cf8-437c-8c39-5f1fc9efa3dd","subject":"Error contract","status":"open","region":"eu","participants":["qa-bbc3076529c1","qa-504e8929f784"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:59.539629221Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-66335095-3e32-4ab9-8185-aa7617085ce1

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 86d035f3-9e82-45a9-8918-67f6b321f225
X-Correlation-Id: qa-66335095-3e32-4ab9-8185-aa7617085ce1
Content-Type: application/json

--- response: 503 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-66335095-3e32-4ab9-8185-aa7617085ce1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-66335095-3e32-4ab9-8185-aa7617085ce1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-943ad541-00c5-4631-8323-3b952d4a5436

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-943ad541-00c5-4631-8323-3b952d4a5436
Content-Type: application/json

--- request body ---
{"handle":"qa-504e8929f784","password":"****"}

--- response: 200 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-943ad541-00c5-4631-8323-3b952d4a5436
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1a6d6d15-dfc2-44f7-a196-2e939313ab80"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-141f1d24-5635-4827-9ca5-89ef376965aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-141f1d24-5635-4827-9ca5-89ef376965aa
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-141f1d24-5635-4827-9ca5-89ef376965aa
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
correlation: qa-43b90938-affa-4bfd-a2a4-99f365e513f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43b90938-affa-4bfd-a2a4-99f365e513f3
Content-Type: application/json

--- request body ---
{"handle":"qa-504e8929f784","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-43b90938-affa-4bfd-a2a4-99f365e513f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-43b90938-affa-4bfd-a2a4-99f365e513f3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ae0eaa75-791b-41cf-b88d-8b6609368edc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae0eaa75-791b-41cf-b88d-8b6609368edc
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ae0eaa75-791b-41cf-b88d-8b6609368edc
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
correlation: qa-9769cca1-90bd-4fd8-986a-7f7751c8894b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9769cca1-90bd-4fd8-986a-7f7751c8894b
Content-Type: application/json

--- request body ---
{"handle":"qa-bbc3076529c1","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9769cca1-90bd-4fd8-986a-7f7751c8894b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9769cca1-90bd-4fd8-986a-7f7751c8894b"}
```
