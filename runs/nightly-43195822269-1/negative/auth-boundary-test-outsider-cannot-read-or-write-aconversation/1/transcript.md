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
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-571ce27a-98d6-420e-b5f8-30b953b5310f` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-d9a184fb-ac78-4851-84fb-8ed488abc850` |
| 3 | `POST /v1/accounts` | 201 | 20 | `qa-95003336-b3e9-4e65-acb1-b9d5e7a24ce4` |
| 4 | `POST /v1/auth/token` | 200 | 32 | `qa-40053942-cb0d-45f7-a019-c6a445f25011` |
| 5 | `POST /v1/conversations` | 201 | 23 | `qa-819d2d4b-0404-423b-a807-6dea76a18b9a` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-4dec360d-3465-488a-b3ce-656864723ad5` |
| 7 | `GET /v1/conversations/{id}` | 403 | 14 | `qa-3986d438-d953-46d7-93af-407271fb2e36` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 15 | `qa-7da9a0a2-978a-4e04-b8e7-b2843aa28e85` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 32 | `qa-650e30f4-a026-4991-b9dc-b589b653bc4a` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-2d67c539-7800-4bb2-964f-14195f7665dd` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-1c54c341-344d-4d79-aeae-1a04e82b55d7` |
| 12 | `POST /v1/auth/token` | 200 | 12 | `qa-9c912956-d473-41e1-851f-73501bdbcdbb` |
| 13 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-2bb96199-49f9-49d8-a1ef-8d1a8093dd90` |
| 14 | `POST /v1/auth/token` | 401 | 7 | `qa-0cadd74a-8b9f-4cb3-bc9b-84cc8087d928` |
| 15 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-95e1e9df-e566-4059-93a9-8507563322ae` |
| 16 | `POST /v1/auth/token` | 401 | 6 | `qa-cc32ac46-9a42-465e-bcfd-621aa78470b2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-571ce27a-98d6-420e-b5f8-30b953b5310f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-571ce27a-98d6-420e-b5f8-30b953b5310f
Content-Type: application/json

--- request body ---
{"handle":"qa-d67bb7ff6870","displayName":"QA d67bb7ff6870","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-571ce27a-98d6-420e-b5f8-30b953b5310f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Location: /v1/accounts/qa-d67bb7ff6870
X-Served-Region: eu
Content-Length: 181

{"id":"acc_da99c091-1d04-4da5-a8ec-e22af984512f","handle":"qa-d67bb7ff6870","displayName":"QA d67bb7ff6870","region":"eu","role":"user","createdAt":"2026-11-12T09:56:42.277569195Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d9a184fb-ac78-4851-84fb-8ed488abc850

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9a184fb-ac78-4851-84fb-8ed488abc850
Content-Type: application/json

--- request body ---
{"handle":"qa-4e9d7e60a33e","displayName":"QA 4e9d7e60a33e","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9a184fb-ac78-4851-84fb-8ed488abc850
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
Location: /v1/accounts/qa-4e9d7e60a33e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_783f99d1-c054-4a4f-9e6d-1dba97ae9bd9","handle":"qa-4e9d7e60a33e","displayName":"QA 4e9d7e60a33e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:42.318537306Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-95003336-b3e9-4e65-acb1-b9d5e7a24ce4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95003336-b3e9-4e65-acb1-b9d5e7a24ce4
Content-Type: application/json

--- request body ---
{"handle":"qa-b033c08d5d80","displayName":"QA b033c08d5d80","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-95003336-b3e9-4e65-acb1-b9d5e7a24ce4
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
Location: /v1/accounts/qa-b033c08d5d80
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b124fb93-fbbb-4970-9f46-47cb690b4ea0","handle":"qa-b033c08d5d80","displayName":"QA b033c08d5d80","region":"eu","role":"user","createdAt":"2026-11-12T09:56:42.359656150Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-40053942-cb0d-45f7-a019-c6a445f25011

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40053942-cb0d-45f7-a019-c6a445f25011
Content-Type: application/json

--- request body ---
{"handle":"qa-d67bb7ff6870","password":"****"}

--- response: 200 in 32 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-40053942-cb0d-45f7-a019-c6a445f25011
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_da99c091-1d04-4da5-a8ec-e22af984512f"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-819d2d4b-0404-423b-a807-6dea76a18b9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-819d2d4b-0404-423b-a807-6dea76a18b9a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4e9d7e60a33e","subject":"Private","message":"Just us"}

--- response: 201 in 23 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-819d2d4b-0404-423b-a807-6dea76a18b9a
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
Location: /v1/conversations/cnv_0cf523ab-c35d-499b-8282-65b554ba1857
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_0cf523ab-c35d-499b-8282-65b554ba1857","subject":"Private","status":"open","region":"eu","participants":["qa-d67bb7ff6870","qa-4e9d7e60a33e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:42.443391620Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4dec360d-3465-488a-b3ce-656864723ad5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dec360d-3465-488a-b3ce-656864723ad5
Content-Type: application/json

--- request body ---
{"handle":"qa-b033c08d5d80","password":"****"}

--- response: 200 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-4dec360d-3465-488a-b3ce-656864723ad5
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b124fb93-fbbb-4970-9f46-47cb690b4ea0"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_0cf523ab-c35d-499b-8282-65b554ba1857
correlation: qa-3986d438-d953-46d7-93af-407271fb2e36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3986d438-d953-46d7-93af-407271fb2e36
Content-Type: application/json

--- response: 403 in 14 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3986d438-d953-46d7-93af-407271fb2e36
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0cf523ab-c35d-499b-8282-65b554ba1857","correlationId":"qa-3986d438-d953-46d7-93af-407271fb2e36"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_0cf523ab-c35d-499b-8282-65b554ba1857/messages
correlation: qa-7da9a0a2-978a-4e04-b8e7-b2843aa28e85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7da9a0a2-978a-4e04-b8e7-b2843aa28e85
Content-Type: application/json

--- response: 403 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7da9a0a2-978a-4e04-b8e7-b2843aa28e85
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0cf523ab-c35d-499b-8282-65b554ba1857/messages","correlationId":"qa-7da9a0a2-978a-4e04-b8e7-b2843aa28e85"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_0cf523ab-c35d-499b-8282-65b554ba1857/messages
correlation: qa-650e30f4-a026-4991-b9dc-b589b653bc4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-650e30f4-a026-4991-b9dc-b589b653bc4a
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 32 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-650e30f4-a026-4991-b9dc-b589b653bc4a
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0cf523ab-c35d-499b-8282-65b554ba1857/messages","correlationId":"qa-650e30f4-a026-4991-b9dc-b589b653bc4a"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2d67c539-7800-4bb2-964f-14195f7665dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d67c539-7800-4bb2-964f-14195f7665dd
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2d67c539-7800-4bb2-964f-14195f7665dd
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
correlation: qa-1c54c341-344d-4d79-aeae-1a04e82b55d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c54c341-344d-4d79-aeae-1a04e82b55d7
Content-Type: application/json

--- request body ---
{"handle":"qa-b033c08d5d80","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c54c341-344d-4d79-aeae-1a04e82b55d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1c54c341-344d-4d79-aeae-1a04e82b55d7"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-9c912956-d473-41e1-851f-73501bdbcdbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c912956-d473-41e1-851f-73501bdbcdbb
Content-Type: application/json

--- request body ---
{"handle":"qa-4e9d7e60a33e","password":"****"}

--- response: 200 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c912956-d473-41e1-851f-73501bdbcdbb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_783f99d1-c054-4a4f-9e6d-1dba97ae9bd9"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2bb96199-49f9-49d8-a1ef-8d1a8093dd90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bb96199-49f9-49d8-a1ef-8d1a8093dd90
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2bb96199-49f9-49d8-a1ef-8d1a8093dd90
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
correlation: qa-0cadd74a-8b9f-4cb3-bc9b-84cc8087d928

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cadd74a-8b9f-4cb3-bc9b-84cc8087d928
Content-Type: application/json

--- request body ---
{"handle":"qa-4e9d7e60a33e","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0cadd74a-8b9f-4cb3-bc9b-84cc8087d928
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0cadd74a-8b9f-4cb3-bc9b-84cc8087d928"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-95e1e9df-e566-4059-93a9-8507563322ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95e1e9df-e566-4059-93a9-8507563322ae
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-95e1e9df-e566-4059-93a9-8507563322ae
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
correlation: qa-cc32ac46-9a42-465e-bcfd-621aa78470b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc32ac46-9a42-465e-bcfd-621aa78470b2
Content-Type: application/json

--- request body ---
{"handle":"qa-d67bb7ff6870","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc32ac46-9a42-465e-bcfd-621aa78470b2
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cc32ac46-9a42-465e-bcfd-621aa78470b2"}
```
