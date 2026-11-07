# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-31e89671-0c2d-408f-9816-7082ece02ba2` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-3ca18d3d-7e99-4912-b04d-df68c4bd2d46` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-dec6ca63-6207-4f8e-8526-d5bd35927aa3` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-0dbf2410-1982-4a1e-b4d7-b16313559911` |
| 5 | `GET /v1/conversations/{id}` | 503 | 11 | `qa-2ff4966b-333d-4876-934c-270804f27a9c` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-aa503379-1cc6-4a90-85af-a136e61192ee` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-fce28f4f-1b7c-4371-9f72-142ffcc13148` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-5a3dee34-4d5a-4e59-83d1-8ed96eb22ec0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-d3a0c2f2-f883-4aad-b738-62df68bbf1f5` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-c47e1a05-2f7a-4ccd-bf80-d885bfd609e9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-31e89671-0c2d-408f-9816-7082ece02ba2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31e89671-0c2d-408f-9816-7082ece02ba2
Content-Type: application/json

--- request body ---
{"handle":"qa-5db5fb646ebd","displayName":"QA 5db5fb646ebd","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-31e89671-0c2d-408f-9816-7082ece02ba2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 9
Location: /v1/accounts/qa-5db5fb646ebd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5340d69b-a768-43d7-a4d6-d5f78dd6d8e0","handle":"qa-5db5fb646ebd","displayName":"QA 5db5fb646ebd","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.785978609Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3ca18d3d-7e99-4912-b04d-df68c4bd2d46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ca18d3d-7e99-4912-b04d-df68c4bd2d46
Content-Type: application/json

--- request body ---
{"handle":"qa-2a8101136a06","displayName":"QA 2a8101136a06","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ca18d3d-7e99-4912-b04d-df68c4bd2d46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 9
Location: /v1/accounts/qa-2a8101136a06
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e61aa214-e43a-4e33-9392-e395e0905306","handle":"qa-2a8101136a06","displayName":"QA 2a8101136a06","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.820521420Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dec6ca63-6207-4f8e-8526-d5bd35927aa3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dec6ca63-6207-4f8e-8526-d5bd35927aa3
Content-Type: application/json

--- request body ---
{"handle":"qa-5db5fb646ebd","password":"****"}

--- response: 200 in 20 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-dec6ca63-6207-4f8e-8526-d5bd35927aa3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5340d69b-a768-43d7-a4d6-d5f78dd6d8e0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0dbf2410-1982-4a1e-b4d7-b16313559911

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dbf2410-1982-4a1e-b4d7-b16313559911
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2a8101136a06","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dbf2410-1982-4a1e-b4d7-b16313559911
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
Location: /v1/conversations/cnv_e888a4f5-e2b3-404b-87e8-bf178f2e7272
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e888a4f5-e2b3-404b-87e8-bf178f2e7272","subject":"Error contract","status":"open","region":"eu","participants":["qa-5db5fb646ebd","qa-2a8101136a06"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:02.881169023Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_e888a4f5-e2b3-404b-87e8-bf178f2e7272
correlation: qa-2ff4966b-333d-4876-934c-270804f27a9c

--- request headers ---
Accept: application/json
X-Fault-Key: cca802f7-c46c-4450-ab92-f490590f754f
X-Fault: unavailable-once
X-Correlation-Id: qa-2ff4966b-333d-4876-934c-270804f27a9c
Content-Type: application/json

--- response: 503 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ff4966b-333d-4876-934c-270804f27a9c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_e888a4f5-e2b3-404b-87e8-bf178f2e7272","correlationId":"qa-2ff4966b-333d-4876-934c-270804f27a9c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-aa503379-1cc6-4a90-85af-a136e61192ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa503379-1cc6-4a90-85af-a136e61192ee
Content-Type: application/json

--- request body ---
{"handle":"qa-2a8101136a06","password":"****"}

--- response: 200 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa503379-1cc6-4a90-85af-a136e61192ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e61aa214-e43a-4e33-9392-e395e0905306"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fce28f4f-1b7c-4371-9f72-142ffcc13148

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fce28f4f-1b7c-4371-9f72-142ffcc13148
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fce28f4f-1b7c-4371-9f72-142ffcc13148
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
correlation: qa-5a3dee34-4d5a-4e59-83d1-8ed96eb22ec0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a3dee34-4d5a-4e59-83d1-8ed96eb22ec0
Content-Type: application/json

--- request body ---
{"handle":"qa-2a8101136a06","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a3dee34-4d5a-4e59-83d1-8ed96eb22ec0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5a3dee34-4d5a-4e59-83d1-8ed96eb22ec0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d3a0c2f2-f883-4aad-b738-62df68bbf1f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3a0c2f2-f883-4aad-b738-62df68bbf1f5
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d3a0c2f2-f883-4aad-b738-62df68bbf1f5
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
correlation: qa-c47e1a05-2f7a-4ccd-bf80-d885bfd609e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c47e1a05-2f7a-4ccd-bf80-d885bfd609e9
Content-Type: application/json

--- request body ---
{"handle":"qa-5db5fb646ebd","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c47e1a05-2f7a-4ccd-bf80-d885bfd609e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c47e1a05-2f7a-4ccd-bf80-d885bfd609e9"}
```
