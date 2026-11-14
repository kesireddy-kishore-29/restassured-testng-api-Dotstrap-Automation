# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-0fa5f0b0-845f-4291-a09f-2622bceced48` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-8ea832b9-2084-4aff-a7bc-8abe8aafb7cf` |
| 3 | `POST /v1/auth/token` | 200 | 10 | `qa-1f729f10-548a-45d1-bea8-d985eb458c3b` |
| 4 | `POST /v1/conversations` | 201 | 2 | `qa-5e171289-4278-4091-b2db-2f25862e8e24` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 11 | `qa-b1131069-20a8-4da1-a1e7-e233aee8e1d8` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-b3703c11-e2b2-428d-ba97-0cf64a27610b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-edbe71ae-5281-47f5-b50e-218760ca9757` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-5bd0ecfb-2972-4fbf-9c91-f7ac7b2a0a7e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-65348e34-9c56-473d-9d9f-4e62d905eb49` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-f2c26c86-a73b-481f-b9a9-7d700a9768ac` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0fa5f0b0-845f-4291-a09f-2622bceced48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fa5f0b0-845f-4291-a09f-2622bceced48
Content-Type: application/json

--- request body ---
{"handle":"qa-e6f48a58120d","displayName":"QA e6f48a58120d","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fa5f0b0-845f-4291-a09f-2622bceced48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 8
Location: /v1/accounts/qa-e6f48a58120d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0177a3fa-7588-4d1f-80ae-d7e370ef1b1f","handle":"qa-e6f48a58120d","displayName":"QA e6f48a58120d","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.030415457Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8ea832b9-2084-4aff-a7bc-8abe8aafb7cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ea832b9-2084-4aff-a7bc-8abe8aafb7cf
Content-Type: application/json

--- request body ---
{"handle":"qa-05222eb3be86","displayName":"QA 05222eb3be86","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ea832b9-2084-4aff-a7bc-8abe8aafb7cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 8
Location: /v1/accounts/qa-05222eb3be86
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f6cffc12-42c4-427f-985e-9b8e2d5bd7ec","handle":"qa-05222eb3be86","displayName":"QA 05222eb3be86","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.068258661Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1f729f10-548a-45d1-bea8-d985eb458c3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f729f10-548a-45d1-bea8-d985eb458c3b
Content-Type: application/json

--- request body ---
{"handle":"qa-e6f48a58120d","password":"****"}

--- response: 200 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f729f10-548a-45d1-bea8-d985eb458c3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0177a3fa-7588-4d1f-80ae-d7e370ef1b1f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5e171289-4278-4091-b2db-2f25862e8e24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e171289-4278-4091-b2db-2f25862e8e24
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-05222eb3be86","subject":"Error contract","message":"Hi"}

--- response: 201 in 2 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e171289-4278-4091-b2db-2f25862e8e24
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
Location: /v1/conversations/cnv_e1334432-8f5c-41a3-9173-5b4570681e4d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e1334432-8f5c-41a3-9173-5b4570681e4d","subject":"Error contract","status":"open","region":"eu","participants":["qa-e6f48a58120d","qa-05222eb3be86"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:03.132361698Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_e1334432-8f5c-41a3-9173-5b4570681e4d/messages
correlation: qa-b1131069-20a8-4da1-a1e7-e233aee8e1d8

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 23cf5103-6ab7-4398-9eff-d18ea2120da1
X-Correlation-Id: qa-b1131069-20a8-4da1-a1e7-e233aee8e1d8
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1131069-20a8-4da1-a1e7-e233aee8e1d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_e1334432-8f5c-41a3-9173-5b4570681e4d/messages","correlationId":"qa-b1131069-20a8-4da1-a1e7-e233aee8e1d8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b3703c11-e2b2-428d-ba97-0cf64a27610b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3703c11-e2b2-428d-ba97-0cf64a27610b
Content-Type: application/json

--- request body ---
{"handle":"qa-05222eb3be86","password":"****"}

--- response: 200 in 42 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3703c11-e2b2-428d-ba97-0cf64a27610b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f6cffc12-42c4-427f-985e-9b8e2d5bd7ec"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-edbe71ae-5281-47f5-b50e-218760ca9757

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edbe71ae-5281-47f5-b50e-218760ca9757
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-edbe71ae-5281-47f5-b50e-218760ca9757
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
correlation: qa-5bd0ecfb-2972-4fbf-9c91-f7ac7b2a0a7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bd0ecfb-2972-4fbf-9c91-f7ac7b2a0a7e
Content-Type: application/json

--- request body ---
{"handle":"qa-05222eb3be86","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5bd0ecfb-2972-4fbf-9c91-f7ac7b2a0a7e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5bd0ecfb-2972-4fbf-9c91-f7ac7b2a0a7e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-65348e34-9c56-473d-9d9f-4e62d905eb49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65348e34-9c56-473d-9d9f-4e62d905eb49
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-65348e34-9c56-473d-9d9f-4e62d905eb49
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
correlation: qa-f2c26c86-a73b-481f-b9a9-7d700a9768ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2c26c86-a73b-481f-b9a9-7d700a9768ac
Content-Type: application/json

--- request body ---
{"handle":"qa-e6f48a58120d","password":"****"}

--- response: 401 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2c26c86-a73b-481f-b9a9-7d700a9768ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f2c26c86-a73b-481f-b9a9-7d700a9768ac"}
```
