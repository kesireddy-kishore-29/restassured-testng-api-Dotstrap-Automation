# Transcript: Two people start a conversation and exchange messages

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#twoPeopleExchangeMessages` |
| Features | FEAT-CONV-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 366 | `qa-5961f4ed-5fca-428b-a9de-994bd7ae8d16` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-3229e65c-e809-439d-b430-cb610d3dac45` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-900290b7-9683-4297-96f1-9f246147a279` |
| 4 | `POST /v1/conversations` | 201 | 85 | `qa-d1e9ab70-0668-4f01-a7c9-f1c8d667c5d9` |
| 5 | `POST /v1/auth/token` | 200 | 12 | `qa-58175201-6501-4331-ac87-d133791c5cc0` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-d88e969e-9d6b-4664-bb12-013018a2cb0a` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 21 | `qa-37635ebc-9a25-4180-b9af-1bd47fc34809` |
| 8 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-c45bf247-594e-4575-8a20-fc94c3d3c59f` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-414d6188-82ab-4851-9d28-bc24c77ed58e` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-7d7c3e3c-fa4e-4d69-b810-79a075def42f` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-70f8d292-9e40-4192-a693-2cc746d2bb27` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5961f4ed-5fca-428b-a9de-994bd7ae8d16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5961f4ed-5fca-428b-a9de-994bd7ae8d16
Content-Type: application/json

--- request body ---
{"handle":"qa-9332587c3dc2","displayName":"QA 9332587c3dc2","password":"****","region":"eu"}

--- response: 201 in 366 ms ---
Date: Fri, 30 Oct 2026 08:45:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-5961f4ed-5fca-428b-a9de-994bd7ae8d16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-9332587c3dc2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_91185e6d-25aa-4262-9d34-fcb0004ee4a1","handle":"qa-9332587c3dc2","displayName":"QA 9332587c3dc2","region":"eu","role":"user","createdAt":"2026-10-30T08:45:58.315769964Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3229e65c-e809-439d-b430-cb610d3dac45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3229e65c-e809-439d-b430-cb610d3dac45
Content-Type: application/json

--- request body ---
{"handle":"qa-2465d5ac73c8","displayName":"QA 2465d5ac73c8","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Fri, 30 Oct 2026 08:45:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3229e65c-e809-439d-b430-cb610d3dac45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-2465d5ac73c8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_999da40d-0e52-4284-aa98-51fcde18ed55","handle":"qa-2465d5ac73c8","displayName":"QA 2465d5ac73c8","region":"eu","role":"user","createdAt":"2026-10-30T08:45:58.752210044Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-900290b7-9683-4297-96f1-9f246147a279

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-900290b7-9683-4297-96f1-9f246147a279
Content-Type: application/json

--- request body ---
{"handle":"qa-9332587c3dc2","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 30 Oct 2026 08:45:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-900290b7-9683-4297-96f1-9f246147a279
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_91185e6d-25aa-4262-9d34-fcb0004ee4a1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d1e9ab70-0668-4f01-a7c9-f1c8d667c5d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1e9ab70-0668-4f01-a7c9-f1c8d667c5d9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2465d5ac73c8","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 85 ms ---
Date: Fri, 30 Oct 2026 08:45:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1e9ab70-0668-4f01-a7c9-f1c8d667c5d9
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
Location: /v1/conversations/cnv_9b35c8e5-8e33-4415-9d3c-936f0f806b13
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_9b35c8e5-8e33-4415-9d3c-936f0f806b13","subject":"Lunch?","status":"open","region":"eu","participants":["qa-9332587c3dc2","qa-2465d5ac73c8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:45:58.941824505Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-58175201-6501-4331-ac87-d133791c5cc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58175201-6501-4331-ac87-d133791c5cc0
Content-Type: application/json

--- request body ---
{"handle":"qa-2465d5ac73c8","password":"****"}

--- response: 200 in 12 ms ---
Date: Fri, 30 Oct 2026 08:45:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-58175201-6501-4331-ac87-d133791c5cc0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_999da40d-0e52-4284-aa98-51fcde18ed55"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_9b35c8e5-8e33-4415-9d3c-936f0f806b13/messages
correlation: qa-d88e969e-9d6b-4664-bb12-013018a2cb0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d88e969e-9d6b-4664-bb12-013018a2cb0a
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 16 ms ---
Date: Fri, 30 Oct 2026 08:45:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d88e969e-9d6b-4664-bb12-013018a2cb0a
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
Content-Length: 203

{"id":"msg_e4b49b40-b4d1-4949-8154-0a7186ef4f63","conversationId":"cnv_9b35c8e5-8e33-4415-9d3c-936f0f806b13","sender":"qa-2465d5ac73c8","body":"Friday works","createdAt":"2026-10-30T08:45:59.050515675Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_9b35c8e5-8e33-4415-9d3c-936f0f806b13/messages
correlation: qa-37635ebc-9a25-4180-b9af-1bd47fc34809

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37635ebc-9a25-4180-b9af-1bd47fc34809
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 30 Oct 2026 08:45:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-37635ebc-9a25-4180-b9af-1bd47fc34809
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
Content-Length: 432

{"items":[{"id":"msg_8929fe0c-4b20-45b3-b2d0-747a6d8d1584","conversationId":"cnv_9b35c8e5-8e33-4415-9d3c-936f0f806b13","sender":"qa-9332587c3dc2","body":"Free on Friday?","createdAt":"2026-10-30T08:45:58.942262066Z"},{"id":"msg_e4b49b40-b4d1-4949-8154-0a7186ef4f63","conversationId":"cnv_9b35c8e5-8e33-4415-9d3c-936f0f806b13","sender":"qa-2465d5ac73c8","body":"Friday works","createdAt":"2026-10-30T08:45:59.050515675Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c45bf247-594e-4575-8a20-fc94c3d3c59f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c45bf247-594e-4575-8a20-fc94c3d3c59f
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 30 Oct 2026 08:45:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c45bf247-594e-4575-8a20-fc94c3d3c59f
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-414d6188-82ab-4851-9d28-bc24c77ed58e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-414d6188-82ab-4851-9d28-bc24c77ed58e
Content-Type: application/json

--- request body ---
{"handle":"qa-2465d5ac73c8","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 30 Oct 2026 08:45:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-414d6188-82ab-4851-9d28-bc24c77ed58e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-414d6188-82ab-4851-9d28-bc24c77ed58e"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7d7c3e3c-fa4e-4d69-b810-79a075def42f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d7c3e3c-fa4e-4d69-b810-79a075def42f
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 30 Oct 2026 08:45:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7d7c3e3c-fa4e-4d69-b810-79a075def42f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-70f8d292-9e40-4192-a693-2cc746d2bb27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70f8d292-9e40-4192-a693-2cc746d2bb27
Content-Type: application/json

--- request body ---
{"handle":"qa-9332587c3dc2","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 30 Oct 2026 08:45:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70f8d292-9e40-4192-a693-2cc746d2bb27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-70f8d292-9e40-4192-a693-2cc746d2bb27"}
```
