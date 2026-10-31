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
| 1 | `POST /v1/accounts` | 201 | 420 | `qa-d0582e57-50e7-4eb7-9a70-0b7535a96f34` |
| 2 | `POST /v1/accounts` | 201 | 55 | `qa-e46c8a49-8fc0-448e-aecf-b23cdd7e58f2` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-6d84e690-243a-4675-938c-4551fee91218` |
| 4 | `POST /v1/conversations` | 201 | 88 | `qa-b767a0bb-761d-4319-8572-8440dae1aea4` |
| 5 | `GET /v1/conversations` | 200 | 21 | `qa-1a12330f-aa84-4ed6-9e61-4d1f828d62ac` |
| 6 | `GET /v1/conversations/{id}` | 200 | 23 | `qa-12b97cc6-b508-4918-ad1d-0619584adddc` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 26 | `qa-89fef938-b25d-4f73-9d81-526337101869` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 21 | `qa-2583d56e-f4bb-457e-a888-791461a8bad2` |
| 9 | `POST /v1/auth/token` | 200 | 18 | `qa-3aab49da-d590-4175-8da1-2cd82a6b8977` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 30 | `qa-7bf20ea4-9ba6-4026-9b65-97b347be65ac` |
| 11 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-fcd665cb-1c14-420a-bef4-82050ca9edbc` |
| 12 | `POST /v1/auth/token` | 401 | 13 | `qa-adf4e568-ce17-45b3-8fb5-e8e11c38ca4f` |
| 13 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-c63801b0-8261-4a08-a09c-a05b3064903b` |
| 14 | `POST /v1/auth/token` | 401 | 17 | `qa-a84ba4db-5dd8-402a-b383-9539bb6a6955` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d0582e57-50e7-4eb7-9a70-0b7535a96f34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0582e57-50e7-4eb7-9a70-0b7535a96f34
Content-Type: application/json

--- request body ---
{"handle":"qa-7b1d41b575a3","displayName":"QA 7b1d41b575a3","password":"****","region":"eu"}

--- response: 201 in 420 ms ---
Date: Sun, 25 Oct 2026 07:40:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0582e57-50e7-4eb7-9a70-0b7535a96f34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-7b1d41b575a3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bec89cea-ce8b-41a1-a963-a805570939cb","handle":"qa-7b1d41b575a3","displayName":"QA 7b1d41b575a3","region":"eu","role":"user","createdAt":"2026-10-25T07:40:22.956359786Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e46c8a49-8fc0-448e-aecf-b23cdd7e58f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e46c8a49-8fc0-448e-aecf-b23cdd7e58f2
Content-Type: application/json

--- request body ---
{"handle":"qa-01b9013e6ee4","displayName":"QA 01b9013e6ee4","password":"****","region":"eu"}

--- response: 201 in 55 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-e46c8a49-8fc0-448e-aecf-b23cdd7e58f2
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
Location: /v1/accounts/qa-01b9013e6ee4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e2366753-3e58-4fdf-9993-23123de54844","handle":"qa-01b9013e6ee4","displayName":"QA 01b9013e6ee4","region":"eu","role":"user","createdAt":"2026-10-25T07:40:23.381315143Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6d84e690-243a-4675-938c-4551fee91218

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d84e690-243a-4675-938c-4551fee91218
Content-Type: application/json

--- request body ---
{"handle":"qa-7b1d41b575a3","password":"****"}

--- response: 200 in 38 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d84e690-243a-4675-938c-4551fee91218
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bec89cea-ce8b-41a1-a963-a805570939cb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b767a0bb-761d-4319-8572-8440dae1aea4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b767a0bb-761d-4319-8572-8440dae1aea4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-01b9013e6ee4","subject":"Contract check","message":"Hello"}

--- response: 201 in 88 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-b767a0bb-761d-4319-8572-8440dae1aea4
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
Location: /v1/conversations/cnv_b9c857d8-86a7-4608-b0d9-421a2b20bba2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b9c857d8-86a7-4608-b0d9-421a2b20bba2","subject":"Contract check","status":"open","region":"eu","participants":["qa-7b1d41b575a3","qa-01b9013e6ee4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:23.568083884Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-1a12330f-aa84-4ed6-9e61-4d1f828d62ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a12330f-aa84-4ed6-9e61-4d1f828d62ac
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a12330f-aa84-4ed6-9e61-4d1f828d62ac
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

{"items":[{"id":"cnv_b9c857d8-86a7-4608-b0d9-421a2b20bba2","subject":"Contract check","status":"open","region":"eu","participants":["qa-7b1d41b575a3","qa-01b9013e6ee4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:23.568083884Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_b9c857d8-86a7-4608-b0d9-421a2b20bba2
correlation: qa-12b97cc6-b508-4918-ad1d-0619584adddc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12b97cc6-b508-4918-ad1d-0619584adddc
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-12b97cc6-b508-4918-ad1d-0619584adddc
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

{"id":"cnv_b9c857d8-86a7-4608-b0d9-421a2b20bba2","subject":"Contract check","status":"open","region":"eu","participants":["qa-7b1d41b575a3","qa-01b9013e6ee4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:23.568083884Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_b9c857d8-86a7-4608-b0d9-421a2b20bba2/messages
correlation: qa-89fef938-b25d-4f73-9d81-526337101869

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89fef938-b25d-4f73-9d81-526337101869
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-89fef938-b25d-4f73-9d81-526337101869
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

{"id":"msg_be8d03a9-ca52-4ca5-8db2-fd7e5cc26b0c","conversationId":"cnv_b9c857d8-86a7-4608-b0d9-421a2b20bba2","sender":"qa-7b1d41b575a3","body":"Second","createdAt":"2026-10-25T07:40:23.751019649Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_b9c857d8-86a7-4608-b0d9-421a2b20bba2/messages
correlation: qa-2583d56e-f4bb-457e-a888-791461a8bad2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2583d56e-f4bb-457e-a888-791461a8bad2
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-2583d56e-f4bb-457e-a888-791461a8bad2
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

{"items":[{"id":"msg_8a0fba96-ccbc-45bf-8360-124d439789c6","conversationId":"cnv_b9c857d8-86a7-4608-b0d9-421a2b20bba2","sender":"qa-7b1d41b575a3","body":"Hello","createdAt":"2026-10-25T07:40:23.568372277Z"},{"id":"msg_be8d03a9-ca52-4ca5-8db2-fd7e5cc26b0c","conversationId":"cnv_b9c857d8-86a7-4608-b0d9-421a2b20bba2","sender":"qa-7b1d41b575a3","body":"Second","createdAt":"2026-10-25T07:40:23.751019649Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-3aab49da-d590-4175-8da1-2cd82a6b8977

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3aab49da-d590-4175-8da1-2cd82a6b8977
Content-Type: application/json

--- request body ---
{"handle":"qa-01b9013e6ee4","password":"****"}

--- response: 200 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-3aab49da-d590-4175-8da1-2cd82a6b8977
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e2366753-3e58-4fdf-9993-23123de54844"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_b9c857d8-86a7-4608-b0d9-421a2b20bba2/read
correlation: qa-7bf20ea4-9ba6-4026-9b65-97b347be65ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bf20ea4-9ba6-4026-9b65-97b347be65ac
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-7bf20ea4-9ba6-4026-9b65-97b347be65ac
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

{"conversationId":"cnv_b9c857d8-86a7-4608-b0d9-421a2b20bba2","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fcd665cb-1c14-420a-bef4-82050ca9edbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcd665cb-1c14-420a-bef4-82050ca9edbc
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fcd665cb-1c14-420a-bef4-82050ca9edbc
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
correlation: qa-adf4e568-ce17-45b3-8fb5-e8e11c38ca4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adf4e568-ce17-45b3-8fb5-e8e11c38ca4f
Content-Type: application/json

--- request body ---
{"handle":"qa-01b9013e6ee4","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-adf4e568-ce17-45b3-8fb5-e8e11c38ca4f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-adf4e568-ce17-45b3-8fb5-e8e11c38ca4f"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c63801b0-8261-4a08-a09c-a05b3064903b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c63801b0-8261-4a08-a09c-a05b3064903b
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c63801b0-8261-4a08-a09c-a05b3064903b
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
correlation: qa-a84ba4db-5dd8-402a-b383-9539bb6a6955

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a84ba4db-5dd8-402a-b383-9539bb6a6955
Content-Type: application/json

--- request body ---
{"handle":"qa-7b1d41b575a3","password":"****"}

--- response: 401 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a84ba4db-5dd8-402a-b383-9539bb6a6955
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a84ba4db-5dd8-402a-b383-9539bb6a6955"}
```
