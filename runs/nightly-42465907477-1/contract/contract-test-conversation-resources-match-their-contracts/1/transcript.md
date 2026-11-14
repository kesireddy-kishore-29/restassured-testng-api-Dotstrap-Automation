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
| 1 | `POST /v1/accounts` | 201 | 303 | `qa-c1ac37bb-5222-42e3-bb01-5a7e0fcb4876` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-40e2b14e-5aa1-4e99-bdcf-e6725e27ead0` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-1559a454-4b4f-4088-8683-b52cfeed3486` |
| 4 | `POST /v1/conversations` | 201 | 39 | `qa-99ac064e-7cb4-4680-ae0e-c17f8934ad8f` |
| 5 | `GET /v1/conversations` | 200 | 15 | `qa-18a0a99f-e277-40fb-ac8f-dae8c0eecc06` |
| 6 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-033adebb-4e50-4c12-9b53-5f705dba9e80` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-26950c2d-8fcc-4aed-8bb2-8bde0be238ef` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 8 | `qa-37368ac7-9812-4b01-886c-dc0442a49f17` |
| 9 | `POST /v1/auth/token` | 200 | 16 | `qa-f28eea17-08a4-4d29-828a-0ade3787d714` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 17 | `qa-f24fac1f-42d8-40bc-a8f9-f2f2a4e769c0` |
| 11 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-a68952cc-be2d-4f4c-a434-6308e4b59007` |
| 12 | `POST /v1/auth/token` | 401 | 6 | `qa-8231da1f-81e8-4fa2-b82c-5ee54c4c6bc5` |
| 13 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-202b7ec4-fb3b-443a-bbb6-818d51017e50` |
| 14 | `POST /v1/auth/token` | 401 | 12 | `qa-a60475bb-3a5b-459a-bc1a-a9ad810cb956` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c1ac37bb-5222-42e3-bb01-5a7e0fcb4876

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1ac37bb-5222-42e3-bb01-5a7e0fcb4876
Content-Type: application/json

--- request body ---
{"handle":"qa-92596a3387c2","displayName":"QA 92596a3387c2","password":"****","region":"eu"}

--- response: 201 in 303 ms ---
Date: Sun, 08 Nov 2026 09:09:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1ac37bb-5222-42e3-bb01-5a7e0fcb4876
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
Location: /v1/accounts/qa-92596a3387c2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0c0e5de7-f457-4e32-91c4-f425aff821ac","handle":"qa-92596a3387c2","displayName":"QA 92596a3387c2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:00.988537440Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-40e2b14e-5aa1-4e99-bdcf-e6725e27ead0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40e2b14e-5aa1-4e99-bdcf-e6725e27ead0
Content-Type: application/json

--- request body ---
{"handle":"qa-bfa6bf5db7cc","displayName":"QA bfa6bf5db7cc","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-40e2b14e-5aa1-4e99-bdcf-e6725e27ead0
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
Location: /v1/accounts/qa-bfa6bf5db7cc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_52292443-85e6-4eaf-a14b-4ff88d09ec06","handle":"qa-bfa6bf5db7cc","displayName":"QA bfa6bf5db7cc","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.251463242Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1559a454-4b4f-4088-8683-b52cfeed3486

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1559a454-4b4f-4088-8683-b52cfeed3486
Content-Type: application/json

--- request body ---
{"handle":"qa-92596a3387c2","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-1559a454-4b4f-4088-8683-b52cfeed3486
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0c0e5de7-f457-4e32-91c4-f425aff821ac"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-99ac064e-7cb4-4680-ae0e-c17f8934ad8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99ac064e-7cb4-4680-ae0e-c17f8934ad8f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bfa6bf5db7cc","subject":"Contract check","message":"Hello"}

--- response: 201 in 39 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-99ac064e-7cb4-4680-ae0e-c17f8934ad8f
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
Location: /v1/conversations/cnv_03870dde-c535-4e1c-a930-1a1c94e6fb00
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_03870dde-c535-4e1c-a930-1a1c94e6fb00","subject":"Contract check","status":"open","region":"eu","participants":["qa-92596a3387c2","qa-bfa6bf5db7cc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:01.354904681Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-18a0a99f-e277-40fb-ac8f-dae8c0eecc06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18a0a99f-e277-40fb-ac8f-dae8c0eecc06
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-18a0a99f-e277-40fb-ac8f-dae8c0eecc06
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

{"items":[{"id":"cnv_03870dde-c535-4e1c-a930-1a1c94e6fb00","subject":"Contract check","status":"open","region":"eu","participants":["qa-92596a3387c2","qa-bfa6bf5db7cc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:01.354904681Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_03870dde-c535-4e1c-a930-1a1c94e6fb00
correlation: qa-033adebb-4e50-4c12-9b53-5f705dba9e80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-033adebb-4e50-4c12-9b53-5f705dba9e80
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-033adebb-4e50-4c12-9b53-5f705dba9e80
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

{"id":"cnv_03870dde-c535-4e1c-a930-1a1c94e6fb00","subject":"Contract check","status":"open","region":"eu","participants":["qa-92596a3387c2","qa-bfa6bf5db7cc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:01.354904681Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_03870dde-c535-4e1c-a930-1a1c94e6fb00/messages
correlation: qa-26950c2d-8fcc-4aed-8bb2-8bde0be238ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26950c2d-8fcc-4aed-8bb2-8bde0be238ef
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-26950c2d-8fcc-4aed-8bb2-8bde0be238ef
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

{"id":"msg_ba2b7dcc-1f6b-4171-ac2a-e9cbb6c036ea","conversationId":"cnv_03870dde-c535-4e1c-a930-1a1c94e6fb00","sender":"qa-92596a3387c2","body":"Second","createdAt":"2026-11-08T09:09:01.457459024Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_03870dde-c535-4e1c-a930-1a1c94e6fb00/messages
correlation: qa-37368ac7-9812-4b01-886c-dc0442a49f17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37368ac7-9812-4b01-886c-dc0442a49f17
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-37368ac7-9812-4b01-886c-dc0442a49f17
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

{"items":[{"id":"msg_0f9e2d5f-3359-45ee-8aaa-2d5f4d78e46f","conversationId":"cnv_03870dde-c535-4e1c-a930-1a1c94e6fb00","sender":"qa-92596a3387c2","body":"Hello","createdAt":"2026-11-08T09:09:01.355054677Z"},{"id":"msg_ba2b7dcc-1f6b-4171-ac2a-e9cbb6c036ea","conversationId":"cnv_03870dde-c535-4e1c-a930-1a1c94e6fb00","sender":"qa-92596a3387c2","body":"Second","createdAt":"2026-11-08T09:09:01.457459024Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-f28eea17-08a4-4d29-828a-0ade3787d714

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f28eea17-08a4-4d29-828a-0ade3787d714
Content-Type: application/json

--- request body ---
{"handle":"qa-bfa6bf5db7cc","password":"****"}

--- response: 200 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f28eea17-08a4-4d29-828a-0ade3787d714
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_52292443-85e6-4eaf-a14b-4ff88d09ec06"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_03870dde-c535-4e1c-a930-1a1c94e6fb00/read
correlation: qa-f24fac1f-42d8-40bc-a8f9-f2f2a4e769c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f24fac1f-42d8-40bc-a8f9-f2f2a4e769c0
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f24fac1f-42d8-40bc-a8f9-f2f2a4e769c0
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

{"conversationId":"cnv_03870dde-c535-4e1c-a930-1a1c94e6fb00","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a68952cc-be2d-4f4c-a434-6308e4b59007

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a68952cc-be2d-4f4c-a434-6308e4b59007
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a68952cc-be2d-4f4c-a434-6308e4b59007
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
correlation: qa-8231da1f-81e8-4fa2-b82c-5ee54c4c6bc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8231da1f-81e8-4fa2-b82c-5ee54c4c6bc5
Content-Type: application/json

--- request body ---
{"handle":"qa-bfa6bf5db7cc","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8231da1f-81e8-4fa2-b82c-5ee54c4c6bc5
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8231da1f-81e8-4fa2-b82c-5ee54c4c6bc5"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-202b7ec4-fb3b-443a-bbb6-818d51017e50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-202b7ec4-fb3b-443a-bbb6-818d51017e50
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-202b7ec4-fb3b-443a-bbb6-818d51017e50
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
correlation: qa-a60475bb-3a5b-459a-bc1a-a9ad810cb956

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a60475bb-3a5b-459a-bc1a-a9ad810cb956
Content-Type: application/json

--- request body ---
{"handle":"qa-92596a3387c2","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a60475bb-3a5b-459a-bc1a-a9ad810cb956
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a60475bb-3a5b-459a-bc1a-a9ad810cb956"}
```
