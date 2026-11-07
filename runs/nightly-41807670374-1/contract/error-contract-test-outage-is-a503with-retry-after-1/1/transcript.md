# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 456 | `qa-988673ae-4f1a-4e9f-8785-071a910fd7fd` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-e0014dba-efac-43f8-9b0e-355aa1cfe8d3` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-2fdc556c-d7d1-4769-82d9-cb1fb436c766` |
| 4 | `POST /v1/conversations` | 201 | 46 | `qa-a7c05216-ee51-4faf-893a-652d77c6469c` |
| 5 | `POST /v1/accounts` | 503 | 30 | `qa-e44caf62-c34d-4e1c-9e6e-7f6bb1f82a26` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-843ede07-c85c-4f98-ae40-1114113d4a1e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-548913c9-f3ae-4669-a541-8f6c1ae0df35` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-cf4e421a-3271-464c-8a25-dfe076ecd265` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-593bf177-637b-4dcc-9ba7-43fd0e6abcdc` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-5796cc1b-7cf1-47b4-88d4-94a47ade3343` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-988673ae-4f1a-4e9f-8785-071a910fd7fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-988673ae-4f1a-4e9f-8785-071a910fd7fd
Content-Type: application/json

--- request body ---
{"handle":"qa-c4d40026dc64","displayName":"QA c4d40026dc64","password":"****","region":"eu"}

--- response: 201 in 456 ms ---
Date: Wed, 04 Nov 2026 09:28:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-988673ae-4f1a-4e9f-8785-071a910fd7fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Location: /v1/accounts/qa-c4d40026dc64
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1f9e13af-56ad-41a8-97d3-d1d965138536","handle":"qa-c4d40026dc64","displayName":"QA c4d40026dc64","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.100581126Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e0014dba-efac-43f8-9b0e-355aa1cfe8d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0014dba-efac-43f8-9b0e-355aa1cfe8d3
Content-Type: application/json

--- request body ---
{"handle":"qa-cb2da01bd0d8","displayName":"QA cb2da01bd0d8","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0014dba-efac-43f8-9b0e-355aa1cfe8d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Location: /v1/accounts/qa-cb2da01bd0d8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3e9bf11-030b-4561-9d3f-a57002155e7e","handle":"qa-cb2da01bd0d8","displayName":"QA cb2da01bd0d8","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.363136564Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2fdc556c-d7d1-4769-82d9-cb1fb436c766

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fdc556c-d7d1-4769-82d9-cb1fb436c766
Content-Type: application/json

--- request body ---
{"handle":"qa-c4d40026dc64","password":"****"}

--- response: 200 in 39 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fdc556c-d7d1-4769-82d9-cb1fb436c766
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1f9e13af-56ad-41a8-97d3-d1d965138536"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a7c05216-ee51-4faf-893a-652d77c6469c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7c05216-ee51-4faf-893a-652d77c6469c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cb2da01bd0d8","subject":"Error contract","message":"Hi"}

--- response: 201 in 46 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7c05216-ee51-4faf-893a-652d77c6469c
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
Location: /v1/conversations/cnv_16d1f46c-72f7-4f7e-a66c-bc3ef2738d6a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_16d1f46c-72f7-4f7e-a66c-bc3ef2738d6a","subject":"Error contract","status":"open","region":"eu","participants":["qa-c4d40026dc64","qa-cb2da01bd0d8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:01.526533978Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-e44caf62-c34d-4e1c-9e6e-7f6bb1f82a26

--- request headers ---
Accept: application/json
X-Fault-Key: 36a24e18-1695-4db0-95da-d40d7b3b4243
X-Fault: unavailable-once
X-Correlation-Id: qa-e44caf62-c34d-4e1c-9e6e-7f6bb1f82a26
Content-Type: application/json

--- request body ---
{"handle":"qa-9120e191167d","displayName":"QA 9120e191167d","password":"****","region":"eu"}

--- response: 503 in 30 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e44caf62-c34d-4e1c-9e6e-7f6bb1f82a26
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-e44caf62-c34d-4e1c-9e6e-7f6bb1f82a26"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-843ede07-c85c-4f98-ae40-1114113d4a1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-843ede07-c85c-4f98-ae40-1114113d4a1e
Content-Type: application/json

--- request body ---
{"handle":"qa-cb2da01bd0d8","password":"****"}

--- response: 200 in 42 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-843ede07-c85c-4f98-ae40-1114113d4a1e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a3e9bf11-030b-4561-9d3f-a57002155e7e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-548913c9-f3ae-4669-a541-8f6c1ae0df35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-548913c9-f3ae-4669-a541-8f6c1ae0df35
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-548913c9-f3ae-4669-a541-8f6c1ae0df35
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
correlation: qa-cf4e421a-3271-464c-8a25-dfe076ecd265

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf4e421a-3271-464c-8a25-dfe076ecd265
Content-Type: application/json

--- request body ---
{"handle":"qa-cb2da01bd0d8","password":"****"}

--- response: 401 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf4e421a-3271-464c-8a25-dfe076ecd265
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cf4e421a-3271-464c-8a25-dfe076ecd265"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-593bf177-637b-4dcc-9ba7-43fd0e6abcdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-593bf177-637b-4dcc-9ba7-43fd0e6abcdc
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-593bf177-637b-4dcc-9ba7-43fd0e6abcdc
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
correlation: qa-5796cc1b-7cf1-47b4-88d4-94a47ade3343

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5796cc1b-7cf1-47b4-88d4-94a47ade3343
Content-Type: application/json

--- request body ---
{"handle":"qa-c4d40026dc64","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5796cc1b-7cf1-47b4-88d4-94a47ade3343
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5796cc1b-7cf1-47b4-88d4-94a47ade3343"}
```
