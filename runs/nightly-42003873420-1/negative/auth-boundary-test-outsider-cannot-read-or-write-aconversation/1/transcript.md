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
| 1 | `POST /v1/accounts` | 201 | 475 | `qa-a3ca1ee1-6d51-4f88-a4a4-ba4be4cde5fc` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-c55c8748-ee53-407c-a491-87a4ebf4c86d` |
| 3 | `POST /v1/accounts` | 201 | 29 | `qa-96d1dfd3-8a28-4a35-b0d4-091a5f75abc3` |
| 4 | `POST /v1/auth/token` | 200 | 34 | `qa-ad1015e0-ced4-4c03-980d-3656bd14b56f` |
| 5 | `POST /v1/conversations` | 201 | 33 | `qa-b8216d71-61bc-4835-a75b-709ab3c75c27` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-e0948de4-c62b-4ce4-b89b-d1859bca80fa` |
| 7 | `GET /v1/conversations/{id}` | 403 | 29 | `qa-1e3c1413-277e-4215-b740-c414c96f1f63` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 25 | `qa-02c53949-65cd-40c9-9031-c37e3d01dc55` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 17 | `qa-da14bef6-5d28-42bf-aae2-86585ba3f5c6` |
| 10 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-bd811561-ddf5-4816-858a-215fcc7c8976` |
| 11 | `POST /v1/auth/token` | 401 | 18 | `qa-7ce7b149-5a30-4a24-a04e-98f8c2a2ec4e` |
| 12 | `POST /v1/auth/token` | 200 | 41 | `qa-72c5795e-94f6-4011-815a-0ea8baa6ab0d` |
| 13 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-fcefcb41-0fae-4675-b582-10adbdeee950` |
| 14 | `POST /v1/auth/token` | 401 | 45 | `qa-02a0f7bb-9f83-46ee-8f79-f268075d86ee` |
| 15 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-620d0ab8-c72d-4966-9fae-1cd721ca2635` |
| 16 | `POST /v1/auth/token` | 401 | 17 | `qa-48a6abc2-29fa-4d09-8900-4114e0320f60` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a3ca1ee1-6d51-4f88-a4a4-ba4be4cde5fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3ca1ee1-6d51-4f88-a4a4-ba4be4cde5fc
Content-Type: application/json

--- request body ---
{"handle":"qa-456a13a593df","displayName":"QA 456a13a593df","password":"****","region":"eu"}

--- response: 201 in 475 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3ca1ee1-6d51-4f88-a4a4-ba4be4cde5fc
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
Location: /v1/accounts/qa-456a13a593df
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ae897a14-cf87-4343-bfc1-f19b0a8c034c","handle":"qa-456a13a593df","displayName":"QA 456a13a593df","region":"eu","role":"user","createdAt":"2026-11-05T09:37:53.555232517Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c55c8748-ee53-407c-a491-87a4ebf4c86d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c55c8748-ee53-407c-a491-87a4ebf4c86d
Content-Type: application/json

--- request body ---
{"handle":"qa-55486c2817bc","displayName":"QA 55486c2817bc","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c55c8748-ee53-407c-a491-87a4ebf4c86d
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
Location: /v1/accounts/qa-55486c2817bc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_adfd4f1f-c84e-42ef-9190-f99c3018f004","handle":"qa-55486c2817bc","displayName":"QA 55486c2817bc","region":"eu","role":"user","createdAt":"2026-11-05T09:37:53.947921986Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-96d1dfd3-8a28-4a35-b0d4-091a5f75abc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96d1dfd3-8a28-4a35-b0d4-091a5f75abc3
Content-Type: application/json

--- request body ---
{"handle":"qa-016b45981565","displayName":"QA 016b45981565","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-96d1dfd3-8a28-4a35-b0d4-091a5f75abc3
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
Location: /v1/accounts/qa-016b45981565
X-Served-Region: eu
Content-Length: 181

{"id":"acc_30ea99c0-4e06-461e-a4a9-bfc9e0e805dd","handle":"qa-016b45981565","displayName":"QA 016b45981565","region":"eu","role":"user","createdAt":"2026-11-05T09:37:53.996587881Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-ad1015e0-ced4-4c03-980d-3656bd14b56f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad1015e0-ced4-4c03-980d-3656bd14b56f
Content-Type: application/json

--- request body ---
{"handle":"qa-456a13a593df","password":"****"}

--- response: 200 in 34 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad1015e0-ced4-4c03-980d-3656bd14b56f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ae897a14-cf87-4343-bfc1-f19b0a8c034c"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-b8216d71-61bc-4835-a75b-709ab3c75c27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8216d71-61bc-4835-a75b-709ab3c75c27
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-55486c2817bc","subject":"Private","message":"Just us"}

--- response: 201 in 33 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8216d71-61bc-4835-a75b-709ab3c75c27
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
Location: /v1/conversations/cnv_61dfd438-704f-4204-96c6-088e638030bf
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_61dfd438-704f-4204-96c6-088e638030bf","subject":"Private","status":"open","region":"eu","participants":["qa-456a13a593df","qa-55486c2817bc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:54.091158233Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e0948de4-c62b-4ce4-b89b-d1859bca80fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0948de4-c62b-4ce4-b89b-d1859bca80fa
Content-Type: application/json

--- request body ---
{"handle":"qa-016b45981565","password":"****"}

--- response: 200 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0948de4-c62b-4ce4-b89b-d1859bca80fa
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_30ea99c0-4e06-461e-a4a9-bfc9e0e805dd"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_61dfd438-704f-4204-96c6-088e638030bf
correlation: qa-1e3c1413-277e-4215-b740-c414c96f1f63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e3c1413-277e-4215-b740-c414c96f1f63
Content-Type: application/json

--- response: 403 in 29 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1e3c1413-277e-4215-b740-c414c96f1f63
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_61dfd438-704f-4204-96c6-088e638030bf","correlationId":"qa-1e3c1413-277e-4215-b740-c414c96f1f63"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_61dfd438-704f-4204-96c6-088e638030bf/messages
correlation: qa-02c53949-65cd-40c9-9031-c37e3d01dc55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02c53949-65cd-40c9-9031-c37e3d01dc55
Content-Type: application/json

--- response: 403 in 25 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-02c53949-65cd-40c9-9031-c37e3d01dc55
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_61dfd438-704f-4204-96c6-088e638030bf/messages","correlationId":"qa-02c53949-65cd-40c9-9031-c37e3d01dc55"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_61dfd438-704f-4204-96c6-088e638030bf/messages
correlation: qa-da14bef6-5d28-42bf-aae2-86585ba3f5c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da14bef6-5d28-42bf-aae2-86585ba3f5c6
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da14bef6-5d28-42bf-aae2-86585ba3f5c6
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_61dfd438-704f-4204-96c6-088e638030bf/messages","correlationId":"qa-da14bef6-5d28-42bf-aae2-86585ba3f5c6"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bd811561-ddf5-4816-858a-215fcc7c8976

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd811561-ddf5-4816-858a-215fcc7c8976
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bd811561-ddf5-4816-858a-215fcc7c8976
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
correlation: qa-7ce7b149-5a30-4a24-a04e-98f8c2a2ec4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ce7b149-5a30-4a24-a04e-98f8c2a2ec4e
Content-Type: application/json

--- request body ---
{"handle":"qa-016b45981565","password":"****"}

--- response: 401 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7ce7b149-5a30-4a24-a04e-98f8c2a2ec4e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7ce7b149-5a30-4a24-a04e-98f8c2a2ec4e"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-72c5795e-94f6-4011-815a-0ea8baa6ab0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72c5795e-94f6-4011-815a-0ea8baa6ab0d
Content-Type: application/json

--- request body ---
{"handle":"qa-55486c2817bc","password":"****"}

--- response: 200 in 41 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-72c5795e-94f6-4011-815a-0ea8baa6ab0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_adfd4f1f-c84e-42ef-9190-f99c3018f004"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fcefcb41-0fae-4675-b582-10adbdeee950

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcefcb41-0fae-4675-b582-10adbdeee950
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fcefcb41-0fae-4675-b582-10adbdeee950
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
correlation: qa-02a0f7bb-9f83-46ee-8f79-f268075d86ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02a0f7bb-9f83-46ee-8f79-f268075d86ee
Content-Type: application/json

--- request body ---
{"handle":"qa-55486c2817bc","password":"****"}

--- response: 401 in 45 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-02a0f7bb-9f83-46ee-8f79-f268075d86ee
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-02a0f7bb-9f83-46ee-8f79-f268075d86ee"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-620d0ab8-c72d-4966-9fae-1cd721ca2635

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-620d0ab8-c72d-4966-9fae-1cd721ca2635
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-620d0ab8-c72d-4966-9fae-1cd721ca2635
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-48a6abc2-29fa-4d09-8900-4114e0320f60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48a6abc2-29fa-4d09-8900-4114e0320f60
Content-Type: application/json

--- request body ---
{"handle":"qa-456a13a593df","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48a6abc2-29fa-4d09-8900-4114e0320f60
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-48a6abc2-29fa-4d09-8900-4114e0320f60"}
```
