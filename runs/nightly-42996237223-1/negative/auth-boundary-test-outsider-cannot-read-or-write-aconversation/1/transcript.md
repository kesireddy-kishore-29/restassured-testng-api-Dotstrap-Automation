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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-d8ae75ec-db58-44c2-b093-200004f3d072` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-930384f8-c751-4079-b168-8af937c466e5` |
| 3 | `POST /v1/accounts` | 201 | 22 | `qa-d052d27e-f65c-4b59-8fe7-69ab42a7de59` |
| 4 | `POST /v1/auth/token` | 200 | 37 | `qa-ac8ebffb-6c0a-496c-8329-1c5fdc28fc17` |
| 5 | `POST /v1/conversations` | 201 | 52 | `qa-49a6332a-7f57-43c0-8fed-118df6e7b716` |
| 6 | `POST /v1/auth/token` | 200 | 10 | `qa-d8267c99-66ba-4cde-aec4-5f1026ce072d` |
| 7 | `GET /v1/conversations/{id}` | 403 | 13 | `qa-bbfba73d-cd75-42b3-8c86-ef358474a5c4` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 7 | `qa-31b712df-b79d-4d59-885d-ea63e8108a72` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 6 | `qa-bca757cd-366b-4724-bf97-0134a55cec09` |
| 10 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-4a12295f-9f3d-4beb-bcf8-6be2f6cf59fa` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-1f923c63-cc02-4560-bdcf-0887dded571f` |
| 12 | `POST /v1/auth/token` | 200 | 9 | `qa-03823a9a-fab1-4308-a2d2-40f24de10be2` |
| 13 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-6f7599c5-18e4-43f3-9f2d-47cbca26a2fd` |
| 14 | `POST /v1/auth/token` | 401 | 12 | `qa-e4c8b0b7-62b8-4368-81e0-0984a1ac7474` |
| 15 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-fa4c86f2-6c4e-40fb-b6fe-dde3889d5fd2` |
| 16 | `POST /v1/auth/token` | 401 | 6 | `qa-ee81e411-f47a-4aeb-a1fe-89097a0856e0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d8ae75ec-db58-44c2-b093-200004f3d072

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8ae75ec-db58-44c2-b093-200004f3d072
Content-Type: application/json

--- request body ---
{"handle":"qa-a1f4461fb783","displayName":"QA a1f4461fb783","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8ae75ec-db58-44c2-b093-200004f3d072
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 9
Location: /v1/accounts/qa-a1f4461fb783
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d7128dc7-4eae-49e7-abc9-302425e06d67","handle":"qa-a1f4461fb783","displayName":"QA a1f4461fb783","region":"eu","role":"user","createdAt":"2026-11-11T09:34:30.448021713Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-930384f8-c751-4079-b168-8af937c466e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-930384f8-c751-4079-b168-8af937c466e5
Content-Type: application/json

--- request body ---
{"handle":"qa-485a30d2d1ae","displayName":"QA 485a30d2d1ae","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-930384f8-c751-4079-b168-8af937c466e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Location: /v1/accounts/qa-485a30d2d1ae
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8fcb09a8-93c9-49f8-adc4-69c5836b05c2","handle":"qa-485a30d2d1ae","displayName":"QA 485a30d2d1ae","region":"eu","role":"user","createdAt":"2026-11-11T09:34:30.486654643Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-d052d27e-f65c-4b59-8fe7-69ab42a7de59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d052d27e-f65c-4b59-8fe7-69ab42a7de59
Content-Type: application/json

--- request body ---
{"handle":"qa-b6ac35bfc096","displayName":"QA b6ac35bfc096","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-d052d27e-f65c-4b59-8fe7-69ab42a7de59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Location: /v1/accounts/qa-b6ac35bfc096
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1660f377-daa3-4372-ae69-dbf6d437be91","handle":"qa-b6ac35bfc096","displayName":"QA b6ac35bfc096","region":"eu","role":"user","createdAt":"2026-11-11T09:34:30.527107720Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-ac8ebffb-6c0a-496c-8329-1c5fdc28fc17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac8ebffb-6c0a-496c-8329-1c5fdc28fc17
Content-Type: application/json

--- request body ---
{"handle":"qa-a1f4461fb783","password":"****"}

--- response: 200 in 37 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac8ebffb-6c0a-496c-8329-1c5fdc28fc17
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d7128dc7-4eae-49e7-abc9-302425e06d67"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-49a6332a-7f57-43c0-8fed-118df6e7b716

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49a6332a-7f57-43c0-8fed-118df6e7b716
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-485a30d2d1ae","subject":"Private","message":"Just us"}

--- response: 201 in 52 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-49a6332a-7f57-43c0-8fed-118df6e7b716
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
Location: /v1/conversations/cnv_28f8dc48-fcdc-464c-b43a-0242873576ee
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_28f8dc48-fcdc-464c-b43a-0242873576ee","subject":"Private","status":"open","region":"eu","participants":["qa-a1f4461fb783","qa-485a30d2d1ae"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:30.641023977Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d8267c99-66ba-4cde-aec4-5f1026ce072d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8267c99-66ba-4cde-aec4-5f1026ce072d
Content-Type: application/json

--- request body ---
{"handle":"qa-b6ac35bfc096","password":"****"}

--- response: 200 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8267c99-66ba-4cde-aec4-5f1026ce072d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1660f377-daa3-4372-ae69-dbf6d437be91"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_28f8dc48-fcdc-464c-b43a-0242873576ee
correlation: qa-bbfba73d-cd75-42b3-8c86-ef358474a5c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbfba73d-cd75-42b3-8c86-ef358474a5c4
Content-Type: application/json

--- response: 403 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bbfba73d-cd75-42b3-8c86-ef358474a5c4
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_28f8dc48-fcdc-464c-b43a-0242873576ee","correlationId":"qa-bbfba73d-cd75-42b3-8c86-ef358474a5c4"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_28f8dc48-fcdc-464c-b43a-0242873576ee/messages
correlation: qa-31b712df-b79d-4d59-885d-ea63e8108a72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31b712df-b79d-4d59-885d-ea63e8108a72
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-31b712df-b79d-4d59-885d-ea63e8108a72
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_28f8dc48-fcdc-464c-b43a-0242873576ee/messages","correlationId":"qa-31b712df-b79d-4d59-885d-ea63e8108a72"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_28f8dc48-fcdc-464c-b43a-0242873576ee/messages
correlation: qa-bca757cd-366b-4724-bf97-0134a55cec09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bca757cd-366b-4724-bf97-0134a55cec09
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bca757cd-366b-4724-bf97-0134a55cec09
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_28f8dc48-fcdc-464c-b43a-0242873576ee/messages","correlationId":"qa-bca757cd-366b-4724-bf97-0134a55cec09"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4a12295f-9f3d-4beb-bcf8-6be2f6cf59fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a12295f-9f3d-4beb-bcf8-6be2f6cf59fa
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4a12295f-9f3d-4beb-bcf8-6be2f6cf59fa
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
correlation: qa-1f923c63-cc02-4560-bdcf-0887dded571f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f923c63-cc02-4560-bdcf-0887dded571f
Content-Type: application/json

--- request body ---
{"handle":"qa-b6ac35bfc096","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f923c63-cc02-4560-bdcf-0887dded571f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1f923c63-cc02-4560-bdcf-0887dded571f"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-03823a9a-fab1-4308-a2d2-40f24de10be2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03823a9a-fab1-4308-a2d2-40f24de10be2
Content-Type: application/json

--- request body ---
{"handle":"qa-485a30d2d1ae","password":"****"}

--- response: 200 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-03823a9a-fab1-4308-a2d2-40f24de10be2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8fcb09a8-93c9-49f8-adc4-69c5836b05c2"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6f7599c5-18e4-43f3-9f2d-47cbca26a2fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f7599c5-18e4-43f3-9f2d-47cbca26a2fd
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6f7599c5-18e4-43f3-9f2d-47cbca26a2fd
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
correlation: qa-e4c8b0b7-62b8-4368-81e0-0984a1ac7474

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4c8b0b7-62b8-4368-81e0-0984a1ac7474
Content-Type: application/json

--- request body ---
{"handle":"qa-485a30d2d1ae","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4c8b0b7-62b8-4368-81e0-0984a1ac7474
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e4c8b0b7-62b8-4368-81e0-0984a1ac7474"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fa4c86f2-6c4e-40fb-b6fe-dde3889d5fd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa4c86f2-6c4e-40fb-b6fe-dde3889d5fd2
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fa4c86f2-6c4e-40fb-b6fe-dde3889d5fd2
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
correlation: qa-ee81e411-f47a-4aeb-a1fe-89097a0856e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee81e411-f47a-4aeb-a1fe-89097a0856e0
Content-Type: application/json

--- request body ---
{"handle":"qa-a1f4461fb783","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee81e411-f47a-4aeb-a1fe-89097a0856e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ee81e411-f47a-4aeb-a1fe-89097a0856e0"}
```
