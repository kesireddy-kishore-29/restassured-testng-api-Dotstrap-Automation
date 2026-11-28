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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-181fcdc6-df94-4867-8e7d-744955150eca` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-539e91a8-7158-4c5a-a6a6-d2d5e2898cc6` |
| 3 | `POST /v1/accounts` | 201 | 21 | `qa-f6c5c117-20ff-4294-9524-5f7fcf96f56c` |
| 4 | `POST /v1/auth/token` | 200 | 15 | `qa-ee99d6c7-fb12-4858-88ce-5b3d6d7ef9e6` |
| 5 | `POST /v1/conversations` | 201 | 26 | `qa-e9311f2f-4d15-46d9-a032-723ef5ac6468` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-57668a46-2404-407d-8fcb-ed67370102c1` |
| 7 | `GET /v1/conversations/{id}` | 403 | 14 | `qa-289a8cee-c270-4733-9e6b-1a05ff426d32` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 12 | `qa-c4b93f04-5f35-4bd2-ac3a-faf40080364d` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 13 | `qa-02671cf6-81c2-4ef2-9e2b-0d1ff15462a6` |
| 10 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-3224850c-a53b-4701-85c5-8da62ad81d80` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-5971bd01-e0a3-4d31-ada2-8adf076f09f4` |
| 12 | `POST /v1/auth/token` | 200 | 19 | `qa-b542472c-9910-41ba-9148-f147b833eea9` |
| 13 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-2b88aa06-b3b8-433b-b3ec-df7e5863be62` |
| 14 | `POST /v1/auth/token` | 401 | 14 | `qa-b45bffc4-f4d8-47fb-b156-968e553b0a0e` |
| 15 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-d0f34d9a-cec6-42cc-acf9-0f983c28698d` |
| 16 | `POST /v1/auth/token` | 401 | 9 | `qa-3cf703bb-0fc6-4171-9664-d6e62d95506d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-181fcdc6-df94-4867-8e7d-744955150eca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-181fcdc6-df94-4867-8e7d-744955150eca
Content-Type: application/json

--- request body ---
{"handle":"qa-73780cd60864","displayName":"QA 73780cd60864","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-181fcdc6-df94-4867-8e7d-744955150eca
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
Location: /v1/accounts/qa-73780cd60864
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d7993d9f-1c8a-4424-befe-1500c39751b4","handle":"qa-73780cd60864","displayName":"QA 73780cd60864","region":"eu","role":"user","createdAt":"2026-11-20T10:09:52.790667976Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-539e91a8-7158-4c5a-a6a6-d2d5e2898cc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-539e91a8-7158-4c5a-a6a6-d2d5e2898cc6
Content-Type: application/json

--- request body ---
{"handle":"qa-c870c67597d8","displayName":"QA c870c67597d8","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-539e91a8-7158-4c5a-a6a6-d2d5e2898cc6
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
Location: /v1/accounts/qa-c870c67597d8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e6a13740-01f9-4def-9d76-582af6191aec","handle":"qa-c870c67597d8","displayName":"QA c870c67597d8","region":"eu","role":"user","createdAt":"2026-11-20T10:09:52.820944698Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-f6c5c117-20ff-4294-9524-5f7fcf96f56c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6c5c117-20ff-4294-9524-5f7fcf96f56c
Content-Type: application/json

--- request body ---
{"handle":"qa-0d73bb6b6572","displayName":"QA 0d73bb6b6572","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6c5c117-20ff-4294-9524-5f7fcf96f56c
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
Location: /v1/accounts/qa-0d73bb6b6572
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8df3a8e8-1f04-435c-bb82-320653269a6f","handle":"qa-0d73bb6b6572","displayName":"QA 0d73bb6b6572","region":"eu","role":"user","createdAt":"2026-11-20T10:09:52.861621099Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-ee99d6c7-fb12-4858-88ce-5b3d6d7ef9e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee99d6c7-fb12-4858-88ce-5b3d6d7ef9e6
Content-Type: application/json

--- request body ---
{"handle":"qa-73780cd60864","password":"****"}

--- response: 200 in 15 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee99d6c7-fb12-4858-88ce-5b3d6d7ef9e6
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d7993d9f-1c8a-4424-befe-1500c39751b4"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-e9311f2f-4d15-46d9-a032-723ef5ac6468

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9311f2f-4d15-46d9-a032-723ef5ac6468
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c870c67597d8","subject":"Private","message":"Just us"}

--- response: 201 in 26 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9311f2f-4d15-46d9-a032-723ef5ac6468
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
Location: /v1/conversations/cnv_d517b58e-7975-46b2-9696-15025ab6928a
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_d517b58e-7975-46b2-9696-15025ab6928a","subject":"Private","status":"open","region":"eu","participants":["qa-73780cd60864","qa-c870c67597d8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:09:52.908964248Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-57668a46-2404-407d-8fcb-ed67370102c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57668a46-2404-407d-8fcb-ed67370102c1
Content-Type: application/json

--- request body ---
{"handle":"qa-0d73bb6b6572","password":"****"}

--- response: 200 in 17 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-57668a46-2404-407d-8fcb-ed67370102c1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8df3a8e8-1f04-435c-bb82-320653269a6f"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_d517b58e-7975-46b2-9696-15025ab6928a
correlation: qa-289a8cee-c270-4733-9e6b-1a05ff426d32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-289a8cee-c270-4733-9e6b-1a05ff426d32
Content-Type: application/json

--- response: 403 in 14 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-289a8cee-c270-4733-9e6b-1a05ff426d32
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_d517b58e-7975-46b2-9696-15025ab6928a","correlationId":"qa-289a8cee-c270-4733-9e6b-1a05ff426d32"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_d517b58e-7975-46b2-9696-15025ab6928a/messages
correlation: qa-c4b93f04-5f35-4bd2-ac3a-faf40080364d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4b93f04-5f35-4bd2-ac3a-faf40080364d
Content-Type: application/json

--- response: 403 in 12 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c4b93f04-5f35-4bd2-ac3a-faf40080364d
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_d517b58e-7975-46b2-9696-15025ab6928a/messages","correlationId":"qa-c4b93f04-5f35-4bd2-ac3a-faf40080364d"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_d517b58e-7975-46b2-9696-15025ab6928a/messages
correlation: qa-02671cf6-81c2-4ef2-9e2b-0d1ff15462a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02671cf6-81c2-4ef2-9e2b-0d1ff15462a6
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 13 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-02671cf6-81c2-4ef2-9e2b-0d1ff15462a6
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_d517b58e-7975-46b2-9696-15025ab6928a/messages","correlationId":"qa-02671cf6-81c2-4ef2-9e2b-0d1ff15462a6"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3224850c-a53b-4701-85c5-8da62ad81d80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3224850c-a53b-4701-85c5-8da62ad81d80
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3224850c-a53b-4701-85c5-8da62ad81d80
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
correlation: qa-5971bd01-e0a3-4d31-ada2-8adf076f09f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5971bd01-e0a3-4d31-ada2-8adf076f09f4
Content-Type: application/json

--- request body ---
{"handle":"qa-0d73bb6b6572","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5971bd01-e0a3-4d31-ada2-8adf076f09f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5971bd01-e0a3-4d31-ada2-8adf076f09f4"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-b542472c-9910-41ba-9148-f147b833eea9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b542472c-9910-41ba-9148-f147b833eea9
Content-Type: application/json

--- request body ---
{"handle":"qa-c870c67597d8","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-b542472c-9910-41ba-9148-f147b833eea9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e6a13740-01f9-4def-9d76-582af6191aec"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2b88aa06-b3b8-433b-b3ec-df7e5863be62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b88aa06-b3b8-433b-b3ec-df7e5863be62
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2b88aa06-b3b8-433b-b3ec-df7e5863be62
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
correlation: qa-b45bffc4-f4d8-47fb-b156-968e553b0a0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b45bffc4-f4d8-47fb-b156-968e553b0a0e
Content-Type: application/json

--- request body ---
{"handle":"qa-c870c67597d8","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b45bffc4-f4d8-47fb-b156-968e553b0a0e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b45bffc4-f4d8-47fb-b156-968e553b0a0e"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d0f34d9a-cec6-42cc-acf9-0f983c28698d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0f34d9a-cec6-42cc-acf9-0f983c28698d
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d0f34d9a-cec6-42cc-acf9-0f983c28698d
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
correlation: qa-3cf703bb-0fc6-4171-9664-d6e62d95506d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cf703bb-0fc6-4171-9664-d6e62d95506d
Content-Type: application/json

--- request body ---
{"handle":"qa-73780cd60864","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 20 Nov 2026 10:09:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3cf703bb-0fc6-4171-9664-d6e62d95506d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3cf703bb-0fc6-4171-9664-d6e62d95506d"}
```
