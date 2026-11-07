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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-1bb57243-07ec-4c1f-8d3d-65093a24f70c` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-99ae54c7-dce5-45c0-9198-e11dd526c3e8` |
| 3 | `POST /v1/auth/token` | 200 | 12 | `qa-3f830553-9c0a-463f-85b9-c13d6aaeab91` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-ab2f9fe1-a370-4afd-8522-0d94cca2e72d` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-f6842b70-2311-4267-8d31-e15319e014ba` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-2f9a31b9-ff2f-4a8d-932d-853541ac0fe2` |
| 7 | `GET /v1/conversations/{id}` | 200 | 9 | `qa-78ee3551-f459-4598-b98d-dce4ca46e82b` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 11 | `qa-d2ce0790-d0bd-45db-a59a-b320c1092a07` |
| 9 | `GET /v1/conversations/{id}` | 200 | 13 | `qa-db5d533a-92fb-46c7-941e-2205a5bd83d6` |
| 10 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-8b4f11a4-f54b-4363-b88c-40090a575b29` |
| 11 | `POST /v1/auth/token` | 401 | 12 | `qa-6a4a4af2-6ac6-414e-9b2b-62afa444c5ba` |
| 12 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-2ac31440-e7b9-4d71-8078-e423a2b83d58` |
| 13 | `POST /v1/auth/token` | 401 | 10 | `qa-75376b68-1093-4a58-87e3-5a2a61ae59a8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1bb57243-07ec-4c1f-8d3d-65093a24f70c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bb57243-07ec-4c1f-8d3d-65093a24f70c
Content-Type: application/json

--- request body ---
{"handle":"qa-aa7b720bd291","displayName":"QA aa7b720bd291","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-1bb57243-07ec-4c1f-8d3d-65093a24f70c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Location: /v1/accounts/qa-aa7b720bd291
X-Served-Region: eu
Content-Length: 181

{"id":"acc_10b63684-4330-48ff-920b-9c2c807093f4","handle":"qa-aa7b720bd291","displayName":"QA aa7b720bd291","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.913437435Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-99ae54c7-dce5-45c0-9198-e11dd526c3e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99ae54c7-dce5-45c0-9198-e11dd526c3e8
Content-Type: application/json

--- request body ---
{"handle":"qa-9c59cb3d1a50","displayName":"QA 9c59cb3d1a50","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-99ae54c7-dce5-45c0-9198-e11dd526c3e8
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
Location: /v1/accounts/qa-9c59cb3d1a50
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8c561653-ada8-4953-9f3d-d8f8648dbb50","handle":"qa-9c59cb3d1a50","displayName":"QA 9c59cb3d1a50","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.936578569Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3f830553-9c0a-463f-85b9-c13d6aaeab91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f830553-9c0a-463f-85b9-c13d6aaeab91
Content-Type: application/json

--- request body ---
{"handle":"qa-aa7b720bd291","password":"****"}

--- response: 200 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f830553-9c0a-463f-85b9-c13d6aaeab91
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_10b63684-4330-48ff-920b-9c2c807093f4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ab2f9fe1-a370-4afd-8522-0d94cca2e72d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab2f9fe1-a370-4afd-8522-0d94cca2e72d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9c59cb3d1a50","subject":"Updates","message":"First"}

--- response: 201 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab2f9fe1-a370-4afd-8522-0d94cca2e72d
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
Location: /v1/conversations/cnv_7bac2478-704a-477e-95c2-845a9adc3215
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_7bac2478-704a-477e-95c2-845a9adc3215","subject":"Updates","status":"open","region":"eu","participants":["qa-aa7b720bd291","qa-9c59cb3d1a50"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:04.972565194Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_7bac2478-704a-477e-95c2-845a9adc3215/messages
correlation: qa-f6842b70-2311-4267-8d31-e15319e014ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6842b70-2311-4267-8d31-e15319e014ba
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6842b70-2311-4267-8d31-e15319e014ba
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

{"id":"msg_906fec9e-74c2-471e-a98c-f79fef783e74","conversationId":"cnv_7bac2478-704a-477e-95c2-845a9adc3215","sender":"qa-aa7b720bd291","body":"Second","createdAt":"2026-10-30T08:46:04.988614069Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2f9a31b9-ff2f-4a8d-932d-853541ac0fe2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f9a31b9-ff2f-4a8d-932d-853541ac0fe2
Content-Type: application/json

--- request body ---
{"handle":"qa-9c59cb3d1a50","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f9a31b9-ff2f-4a8d-932d-853541ac0fe2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8c561653-ada8-4953-9f3d-d8f8648dbb50"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_7bac2478-704a-477e-95c2-845a9adc3215
correlation: qa-78ee3551-f459-4598-b98d-dce4ca46e82b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78ee3551-f459-4598-b98d-dce4ca46e82b
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-78ee3551-f459-4598-b98d-dce4ca46e82b
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

{"id":"cnv_7bac2478-704a-477e-95c2-845a9adc3215","subject":"Updates","status":"open","region":"eu","participants":["qa-aa7b720bd291","qa-9c59cb3d1a50"],"messageCount":2,"unreadCount":2,"createdAt":"2026-10-30T08:46:04.972565194Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_7bac2478-704a-477e-95c2-845a9adc3215/read
correlation: qa-d2ce0790-d0bd-45db-a59a-b320c1092a07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2ce0790-d0bd-45db-a59a-b320c1092a07
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2ce0790-d0bd-45db-a59a-b320c1092a07
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

{"conversationId":"cnv_7bac2478-704a-477e-95c2-845a9adc3215","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_7bac2478-704a-477e-95c2-845a9adc3215
correlation: qa-db5d533a-92fb-46c7-941e-2205a5bd83d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db5d533a-92fb-46c7-941e-2205a5bd83d6
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-db5d533a-92fb-46c7-941e-2205a5bd83d6
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

{"id":"cnv_7bac2478-704a-477e-95c2-845a9adc3215","subject":"Updates","status":"open","region":"eu","participants":["qa-aa7b720bd291","qa-9c59cb3d1a50"],"messageCount":2,"unreadCount":0,"createdAt":"2026-10-30T08:46:04.972565194Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8b4f11a4-f54b-4363-b88c-40090a575b29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b4f11a4-f54b-4363-b88c-40090a575b29
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8b4f11a4-f54b-4363-b88c-40090a575b29
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
correlation: qa-6a4a4af2-6ac6-414e-9b2b-62afa444c5ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a4a4af2-6ac6-414e-9b2b-62afa444c5ba
Content-Type: application/json

--- request body ---
{"handle":"qa-9c59cb3d1a50","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a4a4af2-6ac6-414e-9b2b-62afa444c5ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6a4a4af2-6ac6-414e-9b2b-62afa444c5ba"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2ac31440-e7b9-4d71-8078-e423a2b83d58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ac31440-e7b9-4d71-8078-e423a2b83d58
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2ac31440-e7b9-4d71-8078-e423a2b83d58
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
correlation: qa-75376b68-1093-4a58-87e3-5a2a61ae59a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75376b68-1093-4a58-87e3-5a2a61ae59a8
Content-Type: application/json

--- request body ---
{"handle":"qa-aa7b720bd291","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75376b68-1093-4a58-87e3-5a2a61ae59a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-75376b68-1093-4a58-87e3-5a2a61ae59a8"}
```
