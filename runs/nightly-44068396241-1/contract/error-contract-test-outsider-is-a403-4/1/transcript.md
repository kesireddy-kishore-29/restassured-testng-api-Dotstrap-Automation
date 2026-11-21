# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 65 | `qa-9ad936ae-6015-4f89-8c92-2bbe57a01899` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-930cfc2c-b6cf-4908-983f-20e97f975dfa` |
| 3 | `POST /v1/accounts` | 201 | 22 | `qa-02977486-e2e4-46c0-9c45-f1f9377d5615` |
| 4 | `POST /v1/auth/token` | 200 | 29 | `qa-ddf4d7cd-e013-470e-b110-bbcc210b6b5e` |
| 5 | `POST /v1/conversations` | 201 | 10 | `qa-9eff29e4-8cb9-4d8e-a047-720111510599` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-b46f6bff-27ed-453b-8271-c098c2ab535e` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 11 | `qa-cc66e586-b5eb-43dc-973c-bd71d2be58ba` |
| 8 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-4a687a2f-3199-4885-ab3c-a997dbfc9e7c` |
| 9 | `POST /v1/auth/token` | 401 | 15 | `qa-d10c6139-7930-4c3a-91be-0a9363065921` |
| 10 | `POST /v1/auth/token` | 200 | 15 | `qa-842d0a6f-8956-4b8a-9d96-2435f6450125` |
| 11 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-c9741a69-2591-435e-91c0-efde95d49448` |
| 12 | `POST /v1/auth/token` | 401 | 18 | `qa-40579749-1f0d-47e0-ba3b-9f40326305bf` |
| 13 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-42e08864-e377-4b4a-be3b-2a7020a18e31` |
| 14 | `POST /v1/auth/token` | 401 | 11 | `qa-8a389f39-70ea-41c6-af76-83bc5464ae84` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9ad936ae-6015-4f89-8c92-2bbe57a01899

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ad936ae-6015-4f89-8c92-2bbe57a01899
Content-Type: application/json

--- request body ---
{"handle":"qa-73d74972f7e1","displayName":"QA 73d74972f7e1","password":"****","region":"eu"}

--- response: 201 in 65 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ad936ae-6015-4f89-8c92-2bbe57a01899
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 8
Location: /v1/accounts/qa-73d74972f7e1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2530d523-2220-4f91-acb1-940cbec20a9c","handle":"qa-73d74972f7e1","displayName":"QA 73d74972f7e1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:18.984284723Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-930cfc2c-b6cf-4908-983f-20e97f975dfa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-930cfc2c-b6cf-4908-983f-20e97f975dfa
Content-Type: application/json

--- request body ---
{"handle":"qa-f8cc5813399f","displayName":"QA f8cc5813399f","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-930cfc2c-b6cf-4908-983f-20e97f975dfa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 8
Location: /v1/accounts/qa-f8cc5813399f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6dd4e96c-88c8-4f7f-a056-0f0824c7c1f1","handle":"qa-f8cc5813399f","displayName":"QA f8cc5813399f","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.019579943Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-02977486-e2e4-46c0-9c45-f1f9377d5615

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02977486-e2e4-46c0-9c45-f1f9377d5615
Content-Type: application/json

--- request body ---
{"handle":"qa-169dee37a013","displayName":"QA 169dee37a013","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-02977486-e2e4-46c0-9c45-f1f9377d5615
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 8
Location: /v1/accounts/qa-169dee37a013
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b72c6b60-91b8-414d-be9b-5b0ff3dd1556","handle":"qa-169dee37a013","displayName":"QA 169dee37a013","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.048695945Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-ddf4d7cd-e013-470e-b110-bbcc210b6b5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddf4d7cd-e013-470e-b110-bbcc210b6b5e
Content-Type: application/json

--- request body ---
{"handle":"qa-73d74972f7e1","password":"****"}

--- response: 200 in 29 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddf4d7cd-e013-470e-b110-bbcc210b6b5e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2530d523-2220-4f91-acb1-940cbec20a9c"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-9eff29e4-8cb9-4d8e-a047-720111510599

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9eff29e4-8cb9-4d8e-a047-720111510599
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f8cc5813399f","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-9eff29e4-8cb9-4d8e-a047-720111510599
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
Location: /v1/conversations/cnv_53a8c3db-22ed-4cfe-9e75-9976797f2eec
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_53a8c3db-22ed-4cfe-9e75-9976797f2eec","subject":"Error contract","status":"open","region":"eu","participants":["qa-73d74972f7e1","qa-f8cc5813399f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.117617358Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b46f6bff-27ed-453b-8271-c098c2ab535e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b46f6bff-27ed-453b-8271-c098c2ab535e
Content-Type: application/json

--- request body ---
{"handle":"qa-169dee37a013","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-b46f6bff-27ed-453b-8271-c098c2ab535e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b72c6b60-91b8-414d-be9b-5b0ff3dd1556"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_53a8c3db-22ed-4cfe-9e75-9976797f2eec/close
correlation: qa-cc66e586-b5eb-43dc-973c-bd71d2be58ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc66e586-b5eb-43dc-973c-bd71d2be58ba
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc66e586-b5eb-43dc-973c-bd71d2be58ba
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_53a8c3db-22ed-4cfe-9e75-9976797f2eec/close","correlationId":"qa-cc66e586-b5eb-43dc-973c-bd71d2be58ba"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4a687a2f-3199-4885-ab3c-a997dbfc9e7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a687a2f-3199-4885-ab3c-a997dbfc9e7c
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4a687a2f-3199-4885-ab3c-a997dbfc9e7c
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
correlation: qa-d10c6139-7930-4c3a-91be-0a9363065921

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d10c6139-7930-4c3a-91be-0a9363065921
Content-Type: application/json

--- request body ---
{"handle":"qa-169dee37a013","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d10c6139-7930-4c3a-91be-0a9363065921
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d10c6139-7930-4c3a-91be-0a9363065921"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-842d0a6f-8956-4b8a-9d96-2435f6450125

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-842d0a6f-8956-4b8a-9d96-2435f6450125
Content-Type: application/json

--- request body ---
{"handle":"qa-f8cc5813399f","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-842d0a6f-8956-4b8a-9d96-2435f6450125
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6dd4e96c-88c8-4f7f-a056-0f0824c7c1f1"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c9741a69-2591-435e-91c0-efde95d49448

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9741a69-2591-435e-91c0-efde95d49448
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c9741a69-2591-435e-91c0-efde95d49448
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
correlation: qa-40579749-1f0d-47e0-ba3b-9f40326305bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40579749-1f0d-47e0-ba3b-9f40326305bf
Content-Type: application/json

--- request body ---
{"handle":"qa-f8cc5813399f","password":"****"}

--- response: 401 in 18 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40579749-1f0d-47e0-ba3b-9f40326305bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-40579749-1f0d-47e0-ba3b-9f40326305bf"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-42e08864-e377-4b4a-be3b-2a7020a18e31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42e08864-e377-4b4a-be3b-2a7020a18e31
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-42e08864-e377-4b4a-be3b-2a7020a18e31
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-8a389f39-70ea-41c6-af76-83bc5464ae84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a389f39-70ea-41c6-af76-83bc5464ae84
Content-Type: application/json

--- request body ---
{"handle":"qa-73d74972f7e1","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8a389f39-70ea-41c6-af76-83bc5464ae84
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8a389f39-70ea-41c6-af76-83bc5464ae84"}
```
