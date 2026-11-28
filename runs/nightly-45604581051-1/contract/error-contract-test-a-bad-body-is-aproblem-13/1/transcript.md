# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-a6c53368-7cfb-4a92-96e1-73194a8dd19d` |
| 2 | `POST /v1/accounts` | 201 | 49 | `qa-cb6b3cba-6c66-42b4-ba1c-6a508fb6f756` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-0684e503-1ad2-43af-abee-a93deb6e06f9` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-411bc2f2-7184-4e52-94c4-c2ed7c54bef6` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 8 | `qa-66e2b21b-3f02-4404-8efc-d47ed1d03373` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-d0777bba-a59b-4260-8fb5-b24347b8999e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-b7ab04c3-b6c2-4ede-81a9-079f0daf1ede` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-9475bb58-1457-4719-8a80-9100087246cd` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-e35929d2-320d-4f0b-af79-b7a3981efb5c` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-bca18c8b-d25c-4acb-882a-3f4f7fd8914c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a6c53368-7cfb-4a92-96e1-73194a8dd19d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6c53368-7cfb-4a92-96e1-73194a8dd19d
Content-Type: application/json

--- request body ---
{"handle":"qa-bef0a64b5fc8","displayName":"QA bef0a64b5fc8","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6c53368-7cfb-4a92-96e1-73194a8dd19d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 8
Location: /v1/accounts/qa-bef0a64b5fc8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0153f346-4430-42a2-a737-e408636ddb9c","handle":"qa-bef0a64b5fc8","displayName":"QA bef0a64b5fc8","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.263627729Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cb6b3cba-6c66-42b4-ba1c-6a508fb6f756

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb6b3cba-6c66-42b4-ba1c-6a508fb6f756
Content-Type: application/json

--- request body ---
{"handle":"qa-06c03777f2c4","displayName":"QA 06c03777f2c4","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb6b3cba-6c66-42b4-ba1c-6a508fb6f756
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 8
Location: /v1/accounts/qa-06c03777f2c4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6fe44254-c062-4aad-b38f-01f0b110e93b","handle":"qa-06c03777f2c4","displayName":"QA 06c03777f2c4","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.309498044Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0684e503-1ad2-43af-abee-a93deb6e06f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0684e503-1ad2-43af-abee-a93deb6e06f9
Content-Type: application/json

--- request body ---
{"handle":"qa-bef0a64b5fc8","password":"****"}

--- response: 200 in 33 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0684e503-1ad2-43af-abee-a93deb6e06f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0153f346-4430-42a2-a737-e408636ddb9c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-411bc2f2-7184-4e52-94c4-c2ed7c54bef6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-411bc2f2-7184-4e52-94c4-c2ed7c54bef6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-06c03777f2c4","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-411bc2f2-7184-4e52-94c4-c2ed7c54bef6
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
Location: /v1/conversations/cnv_91f6840e-a956-4ac0-a17e-0c32ab4bd2a7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_91f6840e-a956-4ac0-a17e-0c32ab4bd2a7","subject":"Error contract","status":"open","region":"eu","participants":["qa-bef0a64b5fc8","qa-06c03777f2c4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:59.377737116Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_91f6840e-a956-4ac0-a17e-0c32ab4bd2a7/messages
correlation: qa-66e2b21b-3f02-4404-8efc-d47ed1d03373

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66e2b21b-3f02-4404-8efc-d47ed1d03373
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-66e2b21b-3f02-4404-8efc-d47ed1d03373
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_91f6840e-a956-4ac0-a17e-0c32ab4bd2a7/messages","correlationId":"qa-66e2b21b-3f02-4404-8efc-d47ed1d03373"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d0777bba-a59b-4260-8fb5-b24347b8999e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0777bba-a59b-4260-8fb5-b24347b8999e
Content-Type: application/json

--- request body ---
{"handle":"qa-06c03777f2c4","password":"****"}

--- response: 200 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0777bba-a59b-4260-8fb5-b24347b8999e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6fe44254-c062-4aad-b38f-01f0b110e93b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b7ab04c3-b6c2-4ede-81a9-079f0daf1ede

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7ab04c3-b6c2-4ede-81a9-079f0daf1ede
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b7ab04c3-b6c2-4ede-81a9-079f0daf1ede
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-9475bb58-1457-4719-8a80-9100087246cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9475bb58-1457-4719-8a80-9100087246cd
Content-Type: application/json

--- request body ---
{"handle":"qa-06c03777f2c4","password":"****"}

--- response: 401 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9475bb58-1457-4719-8a80-9100087246cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9475bb58-1457-4719-8a80-9100087246cd"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e35929d2-320d-4f0b-af79-b7a3981efb5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e35929d2-320d-4f0b-af79-b7a3981efb5c
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e35929d2-320d-4f0b-af79-b7a3981efb5c
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-bca18c8b-d25c-4acb-882a-3f4f7fd8914c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bca18c8b-d25c-4acb-882a-3f4f7fd8914c
Content-Type: application/json

--- request body ---
{"handle":"qa-bef0a64b5fc8","password":"****"}

--- response: 401 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bca18c8b-d25c-4acb-882a-3f4f7fd8914c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bca18c8b-d25c-4acb-882a-3f4f7fd8914c"}
```
