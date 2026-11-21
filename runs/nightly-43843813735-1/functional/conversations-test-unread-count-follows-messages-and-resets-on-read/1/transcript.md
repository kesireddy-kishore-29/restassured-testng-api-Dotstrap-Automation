# Transcript: Unread counts follow messages and reset when read

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#unreadCountFollowsMessagesAndResetsOnRead` |
| Features | FEAT-CONV-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 404 | `qa-c6b754ea-72d7-4703-a71b-27b2bd46765e` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-96b707c4-f08d-4b1b-9fe5-f8e476f77ccb` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-8b928882-3a6e-4c36-b751-1f4fe9663f89` |
| 4 | `POST /v1/conversations` | 201 | 56 | `qa-b393d5e8-1866-4218-af2e-9effe5537da0` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 33 | `qa-0f00351a-20fb-4ab3-9523-36f89e8e3c69` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-3de46a87-934f-475c-8b57-9729cce2e37e` |
| 7 | `GET /v1/conversations/{id}` | 200 | 16 | `qa-374eae7b-ae2e-4a2e-b19e-3d3a9496afa1` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 28 | `qa-b8dbe79d-be32-4762-9a8b-a761a0ddd0f4` |
| 9 | `GET /v1/conversations/{id}` | 200 | 14 | `qa-7b7984b7-fa27-4f21-922d-f896a3618c9b` |
| 10 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-35a51bae-5228-4764-84e0-a8356e98f9e2` |
| 11 | `POST /v1/auth/token` | 401 | 12 | `qa-05791a8f-0556-46fa-ac21-39f56505535b` |
| 12 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-3e1e64e5-20e7-408a-9983-469f3984cf57` |
| 13 | `POST /v1/auth/token` | 401 | 10 | `qa-e4422de5-b8ca-49ab-a272-21c7e79e2dd8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c6b754ea-72d7-4703-a71b-27b2bd46765e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6b754ea-72d7-4703-a71b-27b2bd46765e
Content-Type: application/json

--- request body ---
{"handle":"qa-96575ce3a04d","displayName":"QA 96575ce3a04d","password":"****","region":"eu"}

--- response: 201 in 404 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6b754ea-72d7-4703-a71b-27b2bd46765e
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
Location: /v1/accounts/qa-96575ce3a04d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_557db88f-89a9-4537-9320-e9996a09584c","handle":"qa-96575ce3a04d","displayName":"QA 96575ce3a04d","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.780918292Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-96b707c4-f08d-4b1b-9fe5-f8e476f77ccb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96b707c4-f08d-4b1b-9fe5-f8e476f77ccb
Content-Type: application/json

--- request body ---
{"handle":"qa-a87e31b4ab1d","displayName":"QA a87e31b4ab1d","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-96b707c4-f08d-4b1b-9fe5-f8e476f77ccb
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
Location: /v1/accounts/qa-a87e31b4ab1d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0a18cbf7-bb6a-488d-9ff3-10d5cbe2fef8","handle":"qa-a87e31b4ab1d","displayName":"QA a87e31b4ab1d","region":"eu","role":"user","createdAt":"2026-11-16T09:53:52.202544659Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8b928882-3a6e-4c36-b751-1f4fe9663f89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b928882-3a6e-4c36-b751-1f4fe9663f89
Content-Type: application/json

--- request body ---
{"handle":"qa-96575ce3a04d","password":"****"}

--- response: 200 in 35 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b928882-3a6e-4c36-b751-1f4fe9663f89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_557db88f-89a9-4537-9320-e9996a09584c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b393d5e8-1866-4218-af2e-9effe5537da0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b393d5e8-1866-4218-af2e-9effe5537da0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a87e31b4ab1d","subject":"Updates","message":"First"}

--- response: 201 in 56 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-b393d5e8-1866-4218-af2e-9effe5537da0
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
Location: /v1/conversations/cnv_d6298044-66e9-4499-8840-88d90feb6ae2
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_d6298044-66e9-4499-8840-88d90feb6ae2","subject":"Updates","status":"open","region":"eu","participants":["qa-96575ce3a04d","qa-a87e31b4ab1d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:52.331321639Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_d6298044-66e9-4499-8840-88d90feb6ae2/messages
correlation: qa-0f00351a-20fb-4ab3-9523-36f89e8e3c69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f00351a-20fb-4ab3-9523-36f89e8e3c69
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 33 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f00351a-20fb-4ab3-9523-36f89e8e3c69
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
Content-Length: 197

{"id":"msg_f7295841-36c5-4b9e-b4d3-9542bfde6a54","conversationId":"cnv_d6298044-66e9-4499-8840-88d90feb6ae2","sender":"qa-96575ce3a04d","body":"Second","createdAt":"2026-11-16T09:53:52.470706047Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3de46a87-934f-475c-8b57-9729cce2e37e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3de46a87-934f-475c-8b57-9729cce2e37e
Content-Type: application/json

--- request body ---
{"handle":"qa-a87e31b4ab1d","password":"****"}

--- response: 200 in 33 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-3de46a87-934f-475c-8b57-9729cce2e37e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0a18cbf7-bb6a-488d-9ff3-10d5cbe2fef8"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_d6298044-66e9-4499-8840-88d90feb6ae2
correlation: qa-374eae7b-ae2e-4a2e-b19e-3d3a9496afa1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-374eae7b-ae2e-4a2e-b19e-3d3a9496afa1
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-374eae7b-ae2e-4a2e-b19e-3d3a9496afa1
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
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_d6298044-66e9-4499-8840-88d90feb6ae2","subject":"Updates","status":"open","region":"eu","participants":["qa-96575ce3a04d","qa-a87e31b4ab1d"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-16T09:53:52.331321639Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_d6298044-66e9-4499-8840-88d90feb6ae2/read
correlation: qa-b8dbe79d-be32-4762-9a8b-a761a0ddd0f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8dbe79d-be32-4762-9a8b-a761a0ddd0f4
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8dbe79d-be32-4762-9a8b-a761a0ddd0f4
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
Content-Length: 77

{"conversationId":"cnv_d6298044-66e9-4499-8840-88d90feb6ae2","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_d6298044-66e9-4499-8840-88d90feb6ae2
correlation: qa-7b7984b7-fa27-4f21-922d-f896a3618c9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b7984b7-fa27-4f21-922d-f896a3618c9b
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b7984b7-fa27-4f21-922d-f896a3618c9b
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
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_d6298044-66e9-4499-8840-88d90feb6ae2","subject":"Updates","status":"open","region":"eu","participants":["qa-96575ce3a04d","qa-a87e31b4ab1d"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-16T09:53:52.331321639Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-35a51bae-5228-4764-84e0-a8356e98f9e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35a51bae-5228-4764-84e0-a8356e98f9e2
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-35a51bae-5228-4764-84e0-a8356e98f9e2
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
correlation: qa-05791a8f-0556-46fa-ac21-39f56505535b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05791a8f-0556-46fa-ac21-39f56505535b
Content-Type: application/json

--- request body ---
{"handle":"qa-a87e31b4ab1d","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05791a8f-0556-46fa-ac21-39f56505535b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-05791a8f-0556-46fa-ac21-39f56505535b"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3e1e64e5-20e7-408a-9983-469f3984cf57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e1e64e5-20e7-408a-9983-469f3984cf57
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3e1e64e5-20e7-408a-9983-469f3984cf57
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-e4422de5-b8ca-49ab-a272-21c7e79e2dd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4422de5-b8ca-49ab-a272-21c7e79e2dd8
Content-Type: application/json

--- request body ---
{"handle":"qa-96575ce3a04d","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4422de5-b8ca-49ab-a272-21c7e79e2dd8
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e4422de5-b8ca-49ab-a272-21c7e79e2dd8"}
```
