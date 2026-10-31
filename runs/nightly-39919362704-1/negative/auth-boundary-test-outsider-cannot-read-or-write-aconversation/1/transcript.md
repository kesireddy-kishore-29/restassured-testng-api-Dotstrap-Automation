# Transcript: Someone outside a conversation gets 403, not its content

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.AuthBoundaryTest#outsiderCannotReadOrWriteAConversation` |
| Features | FEAT-AUTHZ-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-faa8dd3a-915c-4e27-a88f-993e0db6cef0` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-62d9e3cf-2245-418b-bf23-01c779c3dd21` |
| 3 | `POST /v1/accounts` | 201 | 22 | `qa-f94fe6c8-2c5e-4c56-91c1-f91c782a2823` |
| 4 | `POST /v1/auth/token` | 200 | 13 | `qa-8e42f13a-37fb-45dc-b2c0-a69e6e7b6cd1` |
| 5 | `POST /v1/conversations` | 201 | 6 | `qa-e23f4683-aa24-4bb1-896c-8af6759abb06` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-f4e21bf9-7680-4b3e-bbd0-b6bdd33ce5ec` |
| 7 | `GET /v1/conversations/{id}` | 403 | 14 | `qa-7918486c-d2d0-4ee7-8971-41b8a09f504c` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 11 | `qa-6c986ea2-f0fc-4fec-b23f-9f2374ee7940` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 27 | `qa-a5b3de0e-454b-4f60-bb37-44345645cf7b` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-a0b40ecf-801d-4a89-b456-4825cd9b9350` |
| 11 | `POST /v1/auth/token` | 401 | 11 | `qa-874bfe36-8c9a-4302-9587-ce2155b6213f` |
| 12 | `POST /v1/auth/token` | 200 | 11 | `qa-60e268bc-0cb5-4e06-bd96-541841eceb81` |
| 13 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-cf2036a5-ff1a-4454-8f88-e02f355dbe48` |
| 14 | `POST /v1/auth/token` | 401 | 5 | `qa-3bbde2d6-6ef0-4d98-9076-e825db29b620` |
| 15 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-c666f0c7-f52b-47ed-87f1-abd1b54bc8c1` |
| 16 | `POST /v1/auth/token` | 401 | 8 | `qa-04c958d3-517e-4783-9c85-94575ee65f9f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-faa8dd3a-915c-4e27-a88f-993e0db6cef0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-faa8dd3a-915c-4e27-a88f-993e0db6cef0
Content-Type: application/json

--- request body ---
{"handle":"qa-6215a27f9973","displayName":"QA 6215a27f9973","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-faa8dd3a-915c-4e27-a88f-993e0db6cef0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-6215a27f9973
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3903d585-53eb-440d-8f09-7d6bd882a1bb","handle":"qa-6215a27f9973","displayName":"QA 6215a27f9973","region":"eu","role":"user","createdAt":"2026-10-23T07:41:17.597694803Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-62d9e3cf-2245-418b-bf23-01c779c3dd21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62d9e3cf-2245-418b-bf23-01c779c3dd21
Content-Type: application/json

--- request body ---
{"handle":"qa-43127e82f8c9","displayName":"QA 43127e82f8c9","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-62d9e3cf-2245-418b-bf23-01c779c3dd21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Location: /v1/accounts/qa-43127e82f8c9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_562f706a-4416-4638-a379-0064478690ba","handle":"qa-43127e82f8c9","displayName":"QA 43127e82f8c9","region":"eu","role":"user","createdAt":"2026-10-23T07:41:17.641965021Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-f94fe6c8-2c5e-4c56-91c1-f91c782a2823

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f94fe6c8-2c5e-4c56-91c1-f91c782a2823
Content-Type: application/json

--- request body ---
{"handle":"qa-afcf2dab52cf","displayName":"QA afcf2dab52cf","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-f94fe6c8-2c5e-4c56-91c1-f91c782a2823
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Location: /v1/accounts/qa-afcf2dab52cf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_30cf7140-0c5a-4e01-b441-a1bdc94bc66a","handle":"qa-afcf2dab52cf","displayName":"QA afcf2dab52cf","region":"eu","role":"user","createdAt":"2026-10-23T07:41:17.680741508Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-8e42f13a-37fb-45dc-b2c0-a69e6e7b6cd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e42f13a-37fb-45dc-b2c0-a69e6e7b6cd1
Content-Type: application/json

--- request body ---
{"handle":"qa-6215a27f9973","password":"****"}

--- response: 200 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e42f13a-37fb-45dc-b2c0-a69e6e7b6cd1
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3903d585-53eb-440d-8f09-7d6bd882a1bb"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-e23f4683-aa24-4bb1-896c-8af6759abb06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e23f4683-aa24-4bb1-896c-8af6759abb06
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-43127e82f8c9","subject":"Private","message":"Just us"}

--- response: 201 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-e23f4683-aa24-4bb1-896c-8af6759abb06
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
Location: /v1/conversations/cnv_63bbae5e-755f-4926-ab1f-da0213aa058c
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_63bbae5e-755f-4926-ab1f-da0213aa058c","subject":"Private","status":"open","region":"eu","participants":["qa-6215a27f9973","qa-43127e82f8c9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:17.716452704Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f4e21bf9-7680-4b3e-bbd0-b6bdd33ce5ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4e21bf9-7680-4b3e-bbd0-b6bdd33ce5ec
Content-Type: application/json

--- request body ---
{"handle":"qa-afcf2dab52cf","password":"****"}

--- response: 200 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4e21bf9-7680-4b3e-bbd0-b6bdd33ce5ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_30cf7140-0c5a-4e01-b441-a1bdc94bc66a"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_63bbae5e-755f-4926-ab1f-da0213aa058c
correlation: qa-7918486c-d2d0-4ee7-8971-41b8a09f504c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7918486c-d2d0-4ee7-8971-41b8a09f504c
Content-Type: application/json

--- response: 403 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7918486c-d2d0-4ee7-8971-41b8a09f504c
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_63bbae5e-755f-4926-ab1f-da0213aa058c","correlationId":"qa-7918486c-d2d0-4ee7-8971-41b8a09f504c"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_63bbae5e-755f-4926-ab1f-da0213aa058c/messages
correlation: qa-6c986ea2-f0fc-4fec-b23f-9f2374ee7940

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c986ea2-f0fc-4fec-b23f-9f2374ee7940
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6c986ea2-f0fc-4fec-b23f-9f2374ee7940
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_63bbae5e-755f-4926-ab1f-da0213aa058c/messages","correlationId":"qa-6c986ea2-f0fc-4fec-b23f-9f2374ee7940"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_63bbae5e-755f-4926-ab1f-da0213aa058c/messages
correlation: qa-a5b3de0e-454b-4f60-bb37-44345645cf7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5b3de0e-454b-4f60-bb37-44345645cf7b
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 27 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a5b3de0e-454b-4f60-bb37-44345645cf7b
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_63bbae5e-755f-4926-ab1f-da0213aa058c/messages","correlationId":"qa-a5b3de0e-454b-4f60-bb37-44345645cf7b"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a0b40ecf-801d-4a89-b456-4825cd9b9350

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0b40ecf-801d-4a89-b456-4825cd9b9350
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a0b40ecf-801d-4a89-b456-4825cd9b9350
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-874bfe36-8c9a-4302-9587-ce2155b6213f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-874bfe36-8c9a-4302-9587-ce2155b6213f
Content-Type: application/json

--- request body ---
{"handle":"qa-afcf2dab52cf","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-874bfe36-8c9a-4302-9587-ce2155b6213f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-874bfe36-8c9a-4302-9587-ce2155b6213f"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-60e268bc-0cb5-4e06-bd96-541841eceb81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60e268bc-0cb5-4e06-bd96-541841eceb81
Content-Type: application/json

--- request body ---
{"handle":"qa-43127e82f8c9","password":"****"}

--- response: 200 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-60e268bc-0cb5-4e06-bd96-541841eceb81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_562f706a-4416-4638-a379-0064478690ba"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cf2036a5-ff1a-4454-8f88-e02f355dbe48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf2036a5-ff1a-4454-8f88-e02f355dbe48
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cf2036a5-ff1a-4454-8f88-e02f355dbe48
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-3bbde2d6-6ef0-4d98-9076-e825db29b620

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bbde2d6-6ef0-4d98-9076-e825db29b620
Content-Type: application/json

--- request body ---
{"handle":"qa-43127e82f8c9","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3bbde2d6-6ef0-4d98-9076-e825db29b620
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3bbde2d6-6ef0-4d98-9076-e825db29b620"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c666f0c7-f52b-47ed-87f1-abd1b54bc8c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c666f0c7-f52b-47ed-87f1-abd1b54bc8c1
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c666f0c7-f52b-47ed-87f1-abd1b54bc8c1
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

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-04c958d3-517e-4783-9c85-94575ee65f9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04c958d3-517e-4783-9c85-94575ee65f9f
Content-Type: application/json

--- request body ---
{"handle":"qa-6215a27f9973","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-04c958d3-517e-4783-9c85-94575ee65f9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-04c958d3-517e-4783-9c85-94575ee65f9f"}
```
