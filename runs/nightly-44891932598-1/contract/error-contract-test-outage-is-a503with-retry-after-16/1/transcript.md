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
| 1 | `POST /v1/accounts` | 201 | 61 | `qa-aacedc26-07e2-49ec-b00f-0afbc29c5689` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-5e36b911-50dc-4d45-829c-cab7e34b092e` |
| 3 | `POST /v1/auth/token` | 200 | 48 | `qa-ff6cec0a-e65d-42ef-aa8b-b05c009bbe02` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-562e0dec-eec4-4d39-af0a-2c4de47928e2` |
| 5 | `GET /v1/admin/stats` | 503 | 27 | `qa-f6f3f661-faf5-4ca5-83cc-89f1d89800e8` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-6dcc5536-1314-4079-b04f-2281fe148a0d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-2d7ecda0-1dba-4de7-8935-8034f547ebb9` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-682bc782-da00-496d-9a1c-5f9c789fead1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-40c0ee60-5211-4fde-a0a0-9586c6d79b47` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-eab2a80e-9c8f-4cf3-b9c2-316265a811ca` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aacedc26-07e2-49ec-b00f-0afbc29c5689

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aacedc26-07e2-49ec-b00f-0afbc29c5689
Content-Type: application/json

--- request body ---
{"handle":"qa-c0cca87d330b","displayName":"QA c0cca87d330b","password":"****","region":"eu"}

--- response: 201 in 61 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-aacedc26-07e2-49ec-b00f-0afbc29c5689
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 6
Location: /v1/accounts/qa-c0cca87d330b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba77a696-2524-43cf-b4ac-fa76e8e01923","handle":"qa-c0cca87d330b","displayName":"QA c0cca87d330b","region":"eu","role":"user","createdAt":"2026-11-21T09:57:12.347839152Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5e36b911-50dc-4d45-829c-cab7e34b092e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e36b911-50dc-4d45-829c-cab7e34b092e
Content-Type: application/json

--- request body ---
{"handle":"qa-72f49e2f58af","displayName":"QA 72f49e2f58af","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e36b911-50dc-4d45-829c-cab7e34b092e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 6
Location: /v1/accounts/qa-72f49e2f58af
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eb48a3fd-c9c6-46a3-824b-5abfbb02dff7","handle":"qa-72f49e2f58af","displayName":"QA 72f49e2f58af","region":"eu","role":"user","createdAt":"2026-11-21T09:57:12.413502826Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ff6cec0a-e65d-42ef-aa8b-b05c009bbe02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff6cec0a-e65d-42ef-aa8b-b05c009bbe02
Content-Type: application/json

--- request body ---
{"handle":"qa-c0cca87d330b","password":"****"}

--- response: 200 in 48 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff6cec0a-e65d-42ef-aa8b-b05c009bbe02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ba77a696-2524-43cf-b4ac-fa76e8e01923"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-562e0dec-eec4-4d39-af0a-2c4de47928e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-562e0dec-eec4-4d39-af0a-2c4de47928e2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-72f49e2f58af","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-562e0dec-eec4-4d39-af0a-2c4de47928e2
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
Location: /v1/conversations/cnv_0e14eb22-cf87-4326-87cc-2df8d9096e4c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0e14eb22-cf87-4326-87cc-2df8d9096e4c","subject":"Error contract","status":"open","region":"eu","participants":["qa-c0cca87d330b","qa-72f49e2f58af"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:12.547534720Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-f6f3f661-faf5-4ca5-83cc-89f1d89800e8

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 7713f3c6-6d3e-4f3b-96c3-443f59852d9a
X-Correlation-Id: qa-f6f3f661-faf5-4ca5-83cc-89f1d89800e8
Content-Type: application/json

--- response: 503 in 27 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f6f3f661-faf5-4ca5-83cc-89f1d89800e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-f6f3f661-faf5-4ca5-83cc-89f1d89800e8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6dcc5536-1314-4079-b04f-2281fe148a0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dcc5536-1314-4079-b04f-2281fe148a0d
Content-Type: application/json

--- request body ---
{"handle":"qa-72f49e2f58af","password":"****"}

--- response: 200 in 36 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-6dcc5536-1314-4079-b04f-2281fe148a0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eb48a3fd-c9c6-46a3-824b-5abfbb02dff7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2d7ecda0-1dba-4de7-8935-8034f547ebb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d7ecda0-1dba-4de7-8935-8034f547ebb9
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2d7ecda0-1dba-4de7-8935-8034f547ebb9
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
correlation: qa-682bc782-da00-496d-9a1c-5f9c789fead1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-682bc782-da00-496d-9a1c-5f9c789fead1
Content-Type: application/json

--- request body ---
{"handle":"qa-72f49e2f58af","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-682bc782-da00-496d-9a1c-5f9c789fead1
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-682bc782-da00-496d-9a1c-5f9c789fead1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-40c0ee60-5211-4fde-a0a0-9586c6d79b47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40c0ee60-5211-4fde-a0a0-9586c6d79b47
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-40c0ee60-5211-4fde-a0a0-9586c6d79b47
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
correlation: qa-eab2a80e-9c8f-4cf3-b9c2-316265a811ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eab2a80e-9c8f-4cf3-b9c2-316265a811ca
Content-Type: application/json

--- request body ---
{"handle":"qa-c0cca87d330b","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eab2a80e-9c8f-4cf3-b9c2-316265a811ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eab2a80e-9c8f-4cf3-b9c2-316265a811ca"}
```
