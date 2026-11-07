# Transcript: Conversation, message, page and read-state match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#conversationResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-cfbbdd97-a6f0-455c-8563-f061fa397092` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-2de3a5ad-7d85-481c-9273-ff17a1fd26ff` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-2575ffff-8cb2-41f9-b5d8-810b1528ca58` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-c05e7f66-9eef-49fc-ba1b-b0b684c39057` |
| 5 | `GET /v1/conversations` | 200 | 12 | `qa-3936b40e-8ad1-4b25-8a65-bda713bc1681` |
| 6 | `GET /v1/conversations/{id}` | 200 | 6 | `qa-fe85c055-8684-4f39-8c9b-ee12ffb102fd` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-43119bf7-ccc0-46cf-abd7-ccf605280bc4` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 15 | `qa-b69a1317-f4de-4e98-92d6-84157ab498a8` |
| 9 | `POST /v1/auth/token` | 200 | 12 | `qa-90a59f0d-ef1f-4b6d-a5b6-3e37d45f2ede` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 7 | `qa-37099daf-a491-432e-9889-0cd2662bfef0` |
| 11 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-4f4d15c6-a557-41fc-b9cb-54c2f0868b4e` |
| 12 | `POST /v1/auth/token` | 401 | 9 | `qa-df92bc9f-18e1-4d9c-a8fe-66a56f7d7dd3` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-bbe4d57d-3803-417b-98ed-7ca85c4d5b94` |
| 14 | `POST /v1/auth/token` | 401 | 10 | `qa-9748ef09-93a7-44dd-bdd8-2800d07e7157` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cfbbdd97-a6f0-455c-8563-f061fa397092

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfbbdd97-a6f0-455c-8563-f061fa397092
Content-Type: application/json

--- request body ---
{"handle":"qa-a3e91dac12fb","displayName":"QA a3e91dac12fb","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfbbdd97-a6f0-455c-8563-f061fa397092
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 7
Location: /v1/accounts/qa-a3e91dac12fb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c82bd1aa-abf6-4880-8cad-b116a4859b70","handle":"qa-a3e91dac12fb","displayName":"QA a3e91dac12fb","region":"eu","role":"user","createdAt":"2026-11-02T09:38:38.157083343Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2de3a5ad-7d85-481c-9273-ff17a1fd26ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2de3a5ad-7d85-481c-9273-ff17a1fd26ff
Content-Type: application/json

--- request body ---
{"handle":"qa-640242e20d78","displayName":"QA 640242e20d78","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-2de3a5ad-7d85-481c-9273-ff17a1fd26ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 7
Location: /v1/accounts/qa-640242e20d78
X-Served-Region: eu
Content-Length: 181

{"id":"acc_582ffac0-bd53-4deb-b3da-f390db6b0a98","handle":"qa-640242e20d78","displayName":"QA 640242e20d78","region":"eu","role":"user","createdAt":"2026-11-02T09:38:38.183519650Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2575ffff-8cb2-41f9-b5d8-810b1528ca58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2575ffff-8cb2-41f9-b5d8-810b1528ca58
Content-Type: application/json

--- request body ---
{"handle":"qa-a3e91dac12fb","password":"****"}

--- response: 200 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-2575ffff-8cb2-41f9-b5d8-810b1528ca58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c82bd1aa-abf6-4880-8cad-b116a4859b70"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c05e7f66-9eef-49fc-ba1b-b0b684c39057

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c05e7f66-9eef-49fc-ba1b-b0b684c39057
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-640242e20d78","subject":"Contract check","message":"Hello"}

--- response: 201 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-c05e7f66-9eef-49fc-ba1b-b0b684c39057
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
Location: /v1/conversations/cnv_580ef552-3c5d-4f5a-a26f-601c019f41d8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_580ef552-3c5d-4f5a-a26f-601c019f41d8","subject":"Contract check","status":"open","region":"eu","participants":["qa-a3e91dac12fb","qa-640242e20d78"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:38.216965728Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-3936b40e-8ad1-4b25-8a65-bda713bc1681

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3936b40e-8ad1-4b25-8a65-bda713bc1681
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-3936b40e-8ad1-4b25-8a65-bda713bc1681
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
Content-Length: 259

{"items":[{"id":"cnv_580ef552-3c5d-4f5a-a26f-601c019f41d8","subject":"Contract check","status":"open","region":"eu","participants":["qa-a3e91dac12fb","qa-640242e20d78"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:38.216965728Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_580ef552-3c5d-4f5a-a26f-601c019f41d8
correlation: qa-fe85c055-8684-4f39-8c9b-ee12ffb102fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe85c055-8684-4f39-8c9b-ee12ffb102fd
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe85c055-8684-4f39-8c9b-ee12ffb102fd
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
Content-Length: 237

{"id":"cnv_580ef552-3c5d-4f5a-a26f-601c019f41d8","subject":"Contract check","status":"open","region":"eu","participants":["qa-a3e91dac12fb","qa-640242e20d78"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:38.216965728Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_580ef552-3c5d-4f5a-a26f-601c019f41d8/messages
correlation: qa-43119bf7-ccc0-46cf-abd7-ccf605280bc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43119bf7-ccc0-46cf-abd7-ccf605280bc4
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-43119bf7-ccc0-46cf-abd7-ccf605280bc4
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
Content-Length: 197

{"id":"msg_604b08df-196f-4990-8875-08d982f866b4","conversationId":"cnv_580ef552-3c5d-4f5a-a26f-601c019f41d8","sender":"qa-a3e91dac12fb","body":"Second","createdAt":"2026-11-02T09:38:38.278202711Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_580ef552-3c5d-4f5a-a26f-601c019f41d8/messages
correlation: qa-b69a1317-f4de-4e98-92d6-84157ab498a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b69a1317-f4de-4e98-92d6-84157ab498a8
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-b69a1317-f4de-4e98-92d6-84157ab498a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 416

{"items":[{"id":"msg_8c16c40d-352f-450b-ad45-3364d707f13d","conversationId":"cnv_580ef552-3c5d-4f5a-a26f-601c019f41d8","sender":"qa-a3e91dac12fb","body":"Hello","createdAt":"2026-11-02T09:38:38.216970205Z"},{"id":"msg_604b08df-196f-4990-8875-08d982f866b4","conversationId":"cnv_580ef552-3c5d-4f5a-a26f-601c019f41d8","sender":"qa-a3e91dac12fb","body":"Second","createdAt":"2026-11-02T09:38:38.278202711Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-90a59f0d-ef1f-4b6d-a5b6-3e37d45f2ede

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90a59f0d-ef1f-4b6d-a5b6-3e37d45f2ede
Content-Type: application/json

--- request body ---
{"handle":"qa-640242e20d78","password":"****"}

--- response: 200 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-90a59f0d-ef1f-4b6d-a5b6-3e37d45f2ede
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_582ffac0-bd53-4deb-b3da-f390db6b0a98"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_580ef552-3c5d-4f5a-a26f-601c019f41d8/read
correlation: qa-37099daf-a491-432e-9889-0cd2662bfef0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37099daf-a491-432e-9889-0cd2662bfef0
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-37099daf-a491-432e-9889-0cd2662bfef0
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
Content-Length: 77

{"conversationId":"cnv_580ef552-3c5d-4f5a-a26f-601c019f41d8","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f4d15c6-a557-41fc-b9cb-54c2f0868b4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f4d15c6-a557-41fc-b9cb-54c2f0868b4e
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f4d15c6-a557-41fc-b9cb-54c2f0868b4e
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-df92bc9f-18e1-4d9c-a8fe-66a56f7d7dd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df92bc9f-18e1-4d9c-a8fe-66a56f7d7dd3
Content-Type: application/json

--- request body ---
{"handle":"qa-640242e20d78","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df92bc9f-18e1-4d9c-a8fe-66a56f7d7dd3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-df92bc9f-18e1-4d9c-a8fe-66a56f7d7dd3"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bbe4d57d-3803-417b-98ed-7ca85c4d5b94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbe4d57d-3803-417b-98ed-7ca85c4d5b94
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bbe4d57d-3803-417b-98ed-7ca85c4d5b94
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-9748ef09-93a7-44dd-bdd8-2800d07e7157

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9748ef09-93a7-44dd-bdd8-2800d07e7157
Content-Type: application/json

--- request body ---
{"handle":"qa-a3e91dac12fb","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9748ef09-93a7-44dd-bdd8-2800d07e7157
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9748ef09-93a7-44dd-bdd8-2800d07e7157"}
```
