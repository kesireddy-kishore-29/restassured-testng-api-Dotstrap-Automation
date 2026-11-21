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
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-d8bb2cb2-5f00-4c22-89a4-d4c22d3eaf8f` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-2b77999a-1c86-4f58-adc7-b4dbf0118008` |
| 3 | `POST /v1/accounts` | 201 | 16 | `qa-0f345840-e1b5-49b8-b035-9e2018744e21` |
| 4 | `POST /v1/auth/token` | 200 | 20 | `qa-9d35b7b1-e7a4-49a5-bcf9-4ca8674936d2` |
| 5 | `POST /v1/conversations` | 201 | 26 | `qa-f7f82c70-c031-4a94-b5a2-5974abcda723` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-e834f6f7-3489-4998-a7b3-90d8bbc81476` |
| 7 | `GET /v1/conversations/{id}` | 403 | 9 | `qa-6f986f67-f2a1-4c35-88e0-929a46f2d5a0` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 6 | `qa-48f21d1e-a861-474f-b7c4-89de83509881` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 9 | `qa-509ba51e-2a36-498a-bcc3-37a99ad50ab2` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-5fbd15e7-9cf8-4733-b0ec-83eea8e0127d` |
| 11 | `POST /v1/auth/token` | 401 | 13 | `qa-b6d3694e-e504-4f65-8750-000b509e525f` |
| 12 | `POST /v1/auth/token` | 200 | 11 | `qa-8a7f3936-e116-4d02-9333-6599f27e679b` |
| 13 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-fa420e25-f984-413e-89d6-283d799a993a` |
| 14 | `POST /v1/auth/token` | 401 | 5 | `qa-9bf2aa8e-6ebf-494d-8429-9005868255d8` |
| 15 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-71aebbfa-9a3b-4554-9b6f-3d273011bbee` |
| 16 | `POST /v1/auth/token` | 401 | 6 | `qa-cf5ff4bf-0a2b-4db5-8a91-45b8327571b3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d8bb2cb2-5f00-4c22-89a4-d4c22d3eaf8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8bb2cb2-5f00-4c22-89a4-d4c22d3eaf8f
Content-Type: application/json

--- request body ---
{"handle":"qa-e18bcb48ecc2","displayName":"QA e18bcb48ecc2","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8bb2cb2-5f00-4c22-89a4-d4c22d3eaf8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Location: /v1/accounts/qa-e18bcb48ecc2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f97b4126-95d7-4184-a96e-784b755127f1","handle":"qa-e18bcb48ecc2","displayName":"QA e18bcb48ecc2","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.825807255Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2b77999a-1c86-4f58-adc7-b4dbf0118008

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b77999a-1c86-4f58-adc7-b4dbf0118008
Content-Type: application/json

--- request body ---
{"handle":"qa-2f16db73986a","displayName":"QA 2f16db73986a","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b77999a-1c86-4f58-adc7-b4dbf0118008
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
Location: /v1/accounts/qa-2f16db73986a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4d4b006b-fc94-46a5-8ea8-5fcfbc496171","handle":"qa-2f16db73986a","displayName":"QA 2f16db73986a","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.870204824Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-0f345840-e1b5-49b8-b035-9e2018744e21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f345840-e1b5-49b8-b035-9e2018744e21
Content-Type: application/json

--- request body ---
{"handle":"qa-127871981211","displayName":"QA 127871981211","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f345840-e1b5-49b8-b035-9e2018744e21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Location: /v1/accounts/qa-127871981211
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c9d4affa-2139-4a4c-ad00-e76852db6ded","handle":"qa-127871981211","displayName":"QA 127871981211","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.902652618Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-9d35b7b1-e7a4-49a5-bcf9-4ca8674936d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d35b7b1-e7a4-49a5-bcf9-4ca8674936d2
Content-Type: application/json

--- request body ---
{"handle":"qa-e18bcb48ecc2","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d35b7b1-e7a4-49a5-bcf9-4ca8674936d2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f97b4126-95d7-4184-a96e-784b755127f1"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-f7f82c70-c031-4a94-b5a2-5974abcda723

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7f82c70-c031-4a94-b5a2-5974abcda723
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2f16db73986a","subject":"Private","message":"Just us"}

--- response: 201 in 26 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7f82c70-c031-4a94-b5a2-5974abcda723
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
Location: /v1/conversations/cnv_654f8ba8-a728-4933-b600-a6ff11addd78
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_654f8ba8-a728-4933-b600-a6ff11addd78","subject":"Private","status":"open","region":"eu","participants":["qa-e18bcb48ecc2","qa-2f16db73986a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:10.962249030Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e834f6f7-3489-4998-a7b3-90d8bbc81476

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e834f6f7-3489-4998-a7b3-90d8bbc81476
Content-Type: application/json

--- request body ---
{"handle":"qa-127871981211","password":"****"}

--- response: 200 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-e834f6f7-3489-4998-a7b3-90d8bbc81476
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c9d4affa-2139-4a4c-ad00-e76852db6ded"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_654f8ba8-a728-4933-b600-a6ff11addd78
correlation: qa-6f986f67-f2a1-4c35-88e0-929a46f2d5a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f986f67-f2a1-4c35-88e0-929a46f2d5a0
Content-Type: application/json

--- response: 403 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f986f67-f2a1-4c35-88e0-929a46f2d5a0
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_654f8ba8-a728-4933-b600-a6ff11addd78","correlationId":"qa-6f986f67-f2a1-4c35-88e0-929a46f2d5a0"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_654f8ba8-a728-4933-b600-a6ff11addd78/messages
correlation: qa-48f21d1e-a861-474f-b7c4-89de83509881

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48f21d1e-a861-474f-b7c4-89de83509881
Content-Type: application/json

--- response: 403 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48f21d1e-a861-474f-b7c4-89de83509881
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_654f8ba8-a728-4933-b600-a6ff11addd78/messages","correlationId":"qa-48f21d1e-a861-474f-b7c4-89de83509881"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_654f8ba8-a728-4933-b600-a6ff11addd78/messages
correlation: qa-509ba51e-2a36-498a-bcc3-37a99ad50ab2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-509ba51e-2a36-498a-bcc3-37a99ad50ab2
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-509ba51e-2a36-498a-bcc3-37a99ad50ab2
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_654f8ba8-a728-4933-b600-a6ff11addd78/messages","correlationId":"qa-509ba51e-2a36-498a-bcc3-37a99ad50ab2"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5fbd15e7-9cf8-4733-b0ec-83eea8e0127d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fbd15e7-9cf8-4733-b0ec-83eea8e0127d
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5fbd15e7-9cf8-4733-b0ec-83eea8e0127d
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
correlation: qa-b6d3694e-e504-4f65-8750-000b509e525f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6d3694e-e504-4f65-8750-000b509e525f
Content-Type: application/json

--- request body ---
{"handle":"qa-127871981211","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b6d3694e-e504-4f65-8750-000b509e525f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b6d3694e-e504-4f65-8750-000b509e525f"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-8a7f3936-e116-4d02-9333-6599f27e679b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a7f3936-e116-4d02-9333-6599f27e679b
Content-Type: application/json

--- request body ---
{"handle":"qa-2f16db73986a","password":"****"}

--- response: 200 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a7f3936-e116-4d02-9333-6599f27e679b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4d4b006b-fc94-46a5-8ea8-5fcfbc496171"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fa420e25-f984-413e-89d6-283d799a993a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa420e25-f984-413e-89d6-283d799a993a
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fa420e25-f984-413e-89d6-283d799a993a
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
correlation: qa-9bf2aa8e-6ebf-494d-8429-9005868255d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bf2aa8e-6ebf-494d-8429-9005868255d8
Content-Type: application/json

--- request body ---
{"handle":"qa-2f16db73986a","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9bf2aa8e-6ebf-494d-8429-9005868255d8
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9bf2aa8e-6ebf-494d-8429-9005868255d8"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-71aebbfa-9a3b-4554-9b6f-3d273011bbee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71aebbfa-9a3b-4554-9b6f-3d273011bbee
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-71aebbfa-9a3b-4554-9b6f-3d273011bbee
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
correlation: qa-cf5ff4bf-0a2b-4db5-8a91-45b8327571b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf5ff4bf-0a2b-4db5-8a91-45b8327571b3
Content-Type: application/json

--- request body ---
{"handle":"qa-e18bcb48ecc2","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf5ff4bf-0a2b-4db5-8a91-45b8327571b3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cf5ff4bf-0a2b-4db5-8a91-45b8327571b3"}
```
