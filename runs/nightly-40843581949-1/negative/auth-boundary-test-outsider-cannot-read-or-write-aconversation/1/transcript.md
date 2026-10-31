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
| 1 | `POST /v1/accounts` | 201 | 338 | `qa-5ce67db3-8c19-43ff-83df-c90e1d79708b` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-02ef5174-b7f7-453e-92b3-db66a5939944` |
| 3 | `POST /v1/accounts` | 201 | 34 | `qa-98593857-db95-4ec6-8d46-95858b15a2b9` |
| 4 | `POST /v1/auth/token` | 200 | 20 | `qa-d75df49d-9d32-4d95-beff-1ad48c299bad` |
| 5 | `POST /v1/conversations` | 201 | 18 | `qa-60b27e74-7686-4ee8-a1f7-783638b15900` |
| 6 | `POST /v1/auth/token` | 200 | 10 | `qa-2f66632f-7ad0-45b7-98d8-1839d7443f38` |
| 7 | `GET /v1/conversations/{id}` | 403 | 20 | `qa-0836e9ed-0b9a-481b-a17f-d0d1ace4b538` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 7 | `qa-0b5159ce-6043-4056-ae49-74905a3a64e7` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 11 | `qa-9ef5ff92-14b3-4a89-8d1f-ee74fa28832d` |
| 10 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-dcf799cf-5790-400e-82b1-9be2ca954e39` |
| 11 | `POST /v1/auth/token` | 401 | 14 | `qa-8f2a17dc-4bca-494f-b59f-87dec63852c0` |
| 12 | `POST /v1/auth/token` | 200 | 13 | `qa-dde22100-c768-4529-9895-f2a3d0d56466` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-c83bf23f-0617-454f-84d0-c0810088657a` |
| 14 | `POST /v1/auth/token` | 401 | 6 | `qa-56506c9f-df91-49d7-93fb-32277073399d` |
| 15 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-713b5714-11d9-4105-b126-ff9413301f70` |
| 16 | `POST /v1/auth/token` | 401 | 6 | `qa-74ecc5b1-c556-4bc4-87bb-29e2c91854f2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5ce67db3-8c19-43ff-83df-c90e1d79708b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ce67db3-8c19-43ff-83df-c90e1d79708b
Content-Type: application/json

--- request body ---
{"handle":"qa-7eb892ccaa32","displayName":"QA 7eb892ccaa32","password":"****","region":"eu"}

--- response: 201 in 338 ms ---
Date: Thu, 29 Oct 2026 08:38:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ce67db3-8c19-43ff-83df-c90e1d79708b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-7eb892ccaa32
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d87e2555-320c-4030-8637-f39b76ebc08c","handle":"qa-7eb892ccaa32","displayName":"QA 7eb892ccaa32","region":"eu","role":"user","createdAt":"2026-10-29T08:38:50.604004004Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-02ef5174-b7f7-453e-92b3-db66a5939944

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02ef5174-b7f7-453e-92b3-db66a5939944
Content-Type: application/json

--- request body ---
{"handle":"qa-033338dc53aa","displayName":"QA 033338dc53aa","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Thu, 29 Oct 2026 08:38:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-02ef5174-b7f7-453e-92b3-db66a5939944
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
Location: /v1/accounts/qa-033338dc53aa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cbc849c2-c6fb-4686-8c0e-b6d7302cf3a8","handle":"qa-033338dc53aa","displayName":"QA 033338dc53aa","region":"eu","role":"user","createdAt":"2026-10-29T08:38:50.896709416Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-98593857-db95-4ec6-8d46-95858b15a2b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98593857-db95-4ec6-8d46-95858b15a2b9
Content-Type: application/json

--- request body ---
{"handle":"qa-91cdc3e8c59f","displayName":"QA 91cdc3e8c59f","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Thu, 29 Oct 2026 08:38:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-98593857-db95-4ec6-8d46-95858b15a2b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-91cdc3e8c59f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_526cfa7c-9198-4a11-b143-968416de4754","handle":"qa-91cdc3e8c59f","displayName":"QA 91cdc3e8c59f","region":"eu","role":"user","createdAt":"2026-10-29T08:38:50.951554166Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-d75df49d-9d32-4d95-beff-1ad48c299bad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d75df49d-9d32-4d95-beff-1ad48c299bad
Content-Type: application/json

--- request body ---
{"handle":"qa-7eb892ccaa32","password":"****"}

--- response: 200 in 20 ms ---
Date: Thu, 29 Oct 2026 08:38:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-d75df49d-9d32-4d95-beff-1ad48c299bad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d87e2555-320c-4030-8637-f39b76ebc08c"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-60b27e74-7686-4ee8-a1f7-783638b15900

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60b27e74-7686-4ee8-a1f7-783638b15900
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-033338dc53aa","subject":"Private","message":"Just us"}

--- response: 201 in 18 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-60b27e74-7686-4ee8-a1f7-783638b15900
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
Location: /v1/conversations/cnv_6575e12d-ca31-4d25-b0a8-c57e45b30d35
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_6575e12d-ca31-4d25-b0a8-c57e45b30d35","subject":"Private","status":"open","region":"eu","participants":["qa-7eb892ccaa32","qa-033338dc53aa"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:51.025313056Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2f66632f-7ad0-45b7-98d8-1839d7443f38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f66632f-7ad0-45b7-98d8-1839d7443f38
Content-Type: application/json

--- request body ---
{"handle":"qa-91cdc3e8c59f","password":"****"}

--- response: 200 in 10 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f66632f-7ad0-45b7-98d8-1839d7443f38
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_526cfa7c-9198-4a11-b143-968416de4754"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_6575e12d-ca31-4d25-b0a8-c57e45b30d35
correlation: qa-0836e9ed-0b9a-481b-a17f-d0d1ace4b538

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0836e9ed-0b9a-481b-a17f-d0d1ace4b538
Content-Type: application/json

--- response: 403 in 20 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0836e9ed-0b9a-481b-a17f-d0d1ace4b538
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_6575e12d-ca31-4d25-b0a8-c57e45b30d35","correlationId":"qa-0836e9ed-0b9a-481b-a17f-d0d1ace4b538"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_6575e12d-ca31-4d25-b0a8-c57e45b30d35/messages
correlation: qa-0b5159ce-6043-4056-ae49-74905a3a64e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b5159ce-6043-4056-ae49-74905a3a64e7
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0b5159ce-6043-4056-ae49-74905a3a64e7
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_6575e12d-ca31-4d25-b0a8-c57e45b30d35/messages","correlationId":"qa-0b5159ce-6043-4056-ae49-74905a3a64e7"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_6575e12d-ca31-4d25-b0a8-c57e45b30d35/messages
correlation: qa-9ef5ff92-14b3-4a89-8d1f-ee74fa28832d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ef5ff92-14b3-4a89-8d1f-ee74fa28832d
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 11 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ef5ff92-14b3-4a89-8d1f-ee74fa28832d
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_6575e12d-ca31-4d25-b0a8-c57e45b30d35/messages","correlationId":"qa-9ef5ff92-14b3-4a89-8d1f-ee74fa28832d"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dcf799cf-5790-400e-82b1-9be2ca954e39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcf799cf-5790-400e-82b1-9be2ca954e39
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dcf799cf-5790-400e-82b1-9be2ca954e39
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
correlation: qa-8f2a17dc-4bca-494f-b59f-87dec63852c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f2a17dc-4bca-494f-b59f-87dec63852c0
Content-Type: application/json

--- request body ---
{"handle":"qa-91cdc3e8c59f","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f2a17dc-4bca-494f-b59f-87dec63852c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8f2a17dc-4bca-494f-b59f-87dec63852c0"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-dde22100-c768-4529-9895-f2a3d0d56466

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dde22100-c768-4529-9895-f2a3d0d56466
Content-Type: application/json

--- request body ---
{"handle":"qa-033338dc53aa","password":"****"}

--- response: 200 in 13 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-dde22100-c768-4529-9895-f2a3d0d56466
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cbc849c2-c6fb-4686-8c0e-b6d7302cf3a8"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c83bf23f-0617-454f-84d0-c0810088657a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c83bf23f-0617-454f-84d0-c0810088657a
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c83bf23f-0617-454f-84d0-c0810088657a
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
correlation: qa-56506c9f-df91-49d7-93fb-32277073399d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56506c9f-df91-49d7-93fb-32277073399d
Content-Type: application/json

--- request body ---
{"handle":"qa-033338dc53aa","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-56506c9f-df91-49d7-93fb-32277073399d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-56506c9f-df91-49d7-93fb-32277073399d"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-713b5714-11d9-4105-b126-ff9413301f70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-713b5714-11d9-4105-b126-ff9413301f70
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-713b5714-11d9-4105-b126-ff9413301f70
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
correlation: qa-74ecc5b1-c556-4bc4-87bb-29e2c91854f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74ecc5b1-c556-4bc4-87bb-29e2c91854f2
Content-Type: application/json

--- request body ---
{"handle":"qa-7eb892ccaa32","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-74ecc5b1-c556-4bc4-87bb-29e2c91854f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-74ecc5b1-c556-4bc4-87bb-29e2c91854f2"}
```
