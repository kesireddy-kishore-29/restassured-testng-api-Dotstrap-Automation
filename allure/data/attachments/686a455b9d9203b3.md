# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-6fc23b03-e158-403e-850f-3a250f6a41dc` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-44945538-9a0f-42a8-8aac-e5fc1499192c` |
| 3 | `POST /v1/accounts` | 201 | 62 | `qa-f427430c-71f0-43ae-95f5-dfac86b8eb7f` |
| 4 | `POST /v1/auth/token` | 200 | 62 | `qa-e526d25f-76d5-4cf7-a487-d7945328e46c` |
| 5 | `POST /v1/conversations` | 201 | 14 | `qa-cf6b99d2-5b28-4171-80e1-11efacbe0381` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-aab7d2da-4890-4bf3-b3da-b033cc5c96fb` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 27 | `qa-4ae418ff-092d-41a9-aa9f-0a25ce872b31` |
| 8 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-a40bfd93-66a6-43e2-930d-0a214cff66c8` |
| 9 | `POST /v1/auth/token` | 401 | 32 | `qa-19e51275-99be-46fa-99b5-5171a9e280ce` |
| 10 | `POST /v1/auth/token` | 200 | 47 | `qa-ade11cb0-be93-4efe-81bd-3a2cf5652862` |
| 11 | `DELETE /v1/accounts/me` | 204 | 44 | `qa-8132513c-b45c-44d0-9018-87f9c614bfc8` |
| 12 | `POST /v1/auth/token` | 401 | 35 | `qa-a2cb3b1f-c5ce-440e-8d62-4c3c31ec285d` |
| 13 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-74fb8c67-c9f7-4a66-acb1-e10a8f750182` |
| 14 | `POST /v1/auth/token` | 401 | 38 | `qa-61117b30-0922-4bae-b2c8-16236e7716b1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6fc23b03-e158-403e-850f-3a250f6a41dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fc23b03-e158-403e-850f-3a250f6a41dc
Content-Type: application/json

--- request body ---
{"handle":"qa-77f87d99a03e","displayName":"QA 77f87d99a03e","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-6fc23b03-e158-403e-850f-3a250f6a41dc
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
Location: /v1/accounts/qa-77f87d99a03e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2ec9277a-6590-4708-8d25-5ae6f2fee8c2","handle":"qa-77f87d99a03e","displayName":"QA 77f87d99a03e","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.565991450Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-44945538-9a0f-42a8-8aac-e5fc1499192c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44945538-9a0f-42a8-8aac-e5fc1499192c
Content-Type: application/json

--- request body ---
{"handle":"qa-ec3c5df6181a","displayName":"QA ec3c5df6181a","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-44945538-9a0f-42a8-8aac-e5fc1499192c
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
Location: /v1/accounts/qa-ec3c5df6181a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0714d978-83b1-4896-91da-aa64cb83588b","handle":"qa-ec3c5df6181a","displayName":"QA ec3c5df6181a","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.598786216Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-f427430c-71f0-43ae-95f5-dfac86b8eb7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f427430c-71f0-43ae-95f5-dfac86b8eb7f
Content-Type: application/json

--- request body ---
{"handle":"qa-868926450fa9","displayName":"QA 868926450fa9","password":"****","region":"eu"}

--- response: 201 in 62 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-f427430c-71f0-43ae-95f5-dfac86b8eb7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Location: /v1/accounts/qa-868926450fa9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9f6f314d-0247-4017-8f16-d6d3e20b4afe","handle":"qa-868926450fa9","displayName":"QA 868926450fa9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.674109811Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-e526d25f-76d5-4cf7-a487-d7945328e46c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e526d25f-76d5-4cf7-a487-d7945328e46c
Content-Type: application/json

--- request body ---
{"handle":"qa-77f87d99a03e","password":"****"}

--- response: 200 in 62 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-e526d25f-76d5-4cf7-a487-d7945328e46c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ec9277a-6590-4708-8d25-5ae6f2fee8c2"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-cf6b99d2-5b28-4171-80e1-11efacbe0381

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf6b99d2-5b28-4171-80e1-11efacbe0381
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ec3c5df6181a","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf6b99d2-5b28-4171-80e1-11efacbe0381
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
Location: /v1/conversations/cnv_cfcfb66a-d8b9-4c38-8ded-ed49aa8befcc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cfcfb66a-d8b9-4c38-8ded-ed49aa8befcc","subject":"Error contract","status":"open","region":"eu","participants":["qa-77f87d99a03e","qa-ec3c5df6181a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:22.814530985Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-aab7d2da-4890-4bf3-b3da-b033cc5c96fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aab7d2da-4890-4bf3-b3da-b033cc5c96fb
Content-Type: application/json

--- request body ---
{"handle":"qa-868926450fa9","password":"****"}

--- response: 200 in 31 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-aab7d2da-4890-4bf3-b3da-b033cc5c96fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9f6f314d-0247-4017-8f16-d6d3e20b4afe"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_cfcfb66a-d8b9-4c38-8ded-ed49aa8befcc/messages
correlation: qa-4ae418ff-092d-41a9-aa9f-0a25ce872b31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ae418ff-092d-41a9-aa9f-0a25ce872b31
Content-Type: application/json

--- response: 403 in 27 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4ae418ff-092d-41a9-aa9f-0a25ce872b31
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_cfcfb66a-d8b9-4c38-8ded-ed49aa8befcc/messages","correlationId":"qa-4ae418ff-092d-41a9-aa9f-0a25ce872b31"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a40bfd93-66a6-43e2-930d-0a214cff66c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a40bfd93-66a6-43e2-930d-0a214cff66c8
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a40bfd93-66a6-43e2-930d-0a214cff66c8
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-19e51275-99be-46fa-99b5-5171a9e280ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19e51275-99be-46fa-99b5-5171a9e280ce
Content-Type: application/json

--- request body ---
{"handle":"qa-868926450fa9","password":"****"}

--- response: 401 in 32 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-19e51275-99be-46fa-99b5-5171a9e280ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-19e51275-99be-46fa-99b5-5171a9e280ce"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ade11cb0-be93-4efe-81bd-3a2cf5652862

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ade11cb0-be93-4efe-81bd-3a2cf5652862
Content-Type: application/json

--- request body ---
{"handle":"qa-ec3c5df6181a","password":"****"}

--- response: 200 in 47 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-ade11cb0-be93-4efe-81bd-3a2cf5652862
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0714d978-83b1-4896-91da-aa64cb83588b"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8132513c-b45c-44d0-9018-87f9c614bfc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8132513c-b45c-44d0-9018-87f9c614bfc8
Content-Type: application/json

--- response: 204 in 44 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8132513c-b45c-44d0-9018-87f9c614bfc8
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-a2cb3b1f-c5ce-440e-8d62-4c3c31ec285d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2cb3b1f-c5ce-440e-8d62-4c3c31ec285d
Content-Type: application/json

--- request body ---
{"handle":"qa-ec3c5df6181a","password":"****"}

--- response: 401 in 35 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a2cb3b1f-c5ce-440e-8d62-4c3c31ec285d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a2cb3b1f-c5ce-440e-8d62-4c3c31ec285d"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-74fb8c67-c9f7-4a66-acb1-e10a8f750182

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74fb8c67-c9f7-4a66-acb1-e10a8f750182
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-74fb8c67-c9f7-4a66-acb1-e10a8f750182
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-61117b30-0922-4bae-b2c8-16236e7716b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61117b30-0922-4bae-b2c8-16236e7716b1
Content-Type: application/json

--- request body ---
{"handle":"qa-77f87d99a03e","password":"****"}

--- response: 401 in 38 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61117b30-0922-4bae-b2c8-16236e7716b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-61117b30-0922-4bae-b2c8-16236e7716b1"}
```
