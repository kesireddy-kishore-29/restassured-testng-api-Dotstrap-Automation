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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-bfc4f151-ecb6-43ac-90cb-026db15dab7b` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-9b3e8c8c-098d-4730-b43b-33f1974a42c5` |
| 3 | `POST /v1/accounts` | 201 | 35 | `qa-f0bc5d5f-6733-47ff-aeb8-22abdea804de` |
| 4 | `POST /v1/auth/token` | 200 | 47 | `qa-074f5e78-f7f2-491d-b250-42f47311433a` |
| 5 | `POST /v1/conversations` | 201 | 33 | `qa-fa3e8dfd-dad8-46d2-9ab8-41361a9eaae1` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-2b67a345-7e39-4753-ae39-1f2e40a2d2f6` |
| 7 | `GET /v1/conversations/{id}` | 403 | 7 | `qa-24e35808-ccee-4cec-ae4a-ddd48f49b161` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 23 | `qa-fa8358b8-402c-41e9-b303-6a803ce14509` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 18 | `qa-ff564dd5-63b0-4673-a5ed-f435c90bad6f` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-f43fc5d0-344c-4789-a7f6-8e964286a916` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-143454f5-a72c-4161-8b4f-4a26bc8d2658` |
| 12 | `POST /v1/auth/token` | 200 | 10 | `qa-539d1d3e-6490-4e30-a5ed-a959b1010957` |
| 13 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-1143bffa-92ca-4dc0-8c58-9882445096c8` |
| 14 | `POST /v1/auth/token` | 401 | 12 | `qa-5fcfebc4-5b27-4adc-bda2-5898d72a1bf7` |
| 15 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-c2c93a45-3c74-433f-9872-22d8bdc62d4a` |
| 16 | `POST /v1/auth/token` | 401 | 5 | `qa-f2117ea9-b5b8-4a6b-8c34-4821d86ae0ff` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bfc4f151-ecb6-43ac-90cb-026db15dab7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfc4f151-ecb6-43ac-90cb-026db15dab7b
Content-Type: application/json

--- request body ---
{"handle":"qa-6b49e0591f9c","displayName":"QA 6b49e0591f9c","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfc4f151-ecb6-43ac-90cb-026db15dab7b
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
Location: /v1/accounts/qa-6b49e0591f9c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_064f6f90-3c9a-4daf-872e-887ad9347b21","handle":"qa-6b49e0591f9c","displayName":"QA 6b49e0591f9c","region":"eu","role":"user","createdAt":"2026-11-19T10:29:20.641321093Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9b3e8c8c-098d-4730-b43b-33f1974a42c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b3e8c8c-098d-4730-b43b-33f1974a42c5
Content-Type: application/json

--- request body ---
{"handle":"qa-eb537fbcd21e","displayName":"QA eb537fbcd21e","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b3e8c8c-098d-4730-b43b-33f1974a42c5
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
Location: /v1/accounts/qa-eb537fbcd21e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9dd80dec-18f5-479f-8f74-064c18935e18","handle":"qa-eb537fbcd21e","displayName":"QA eb537fbcd21e","region":"eu","role":"user","createdAt":"2026-11-19T10:29:20.684845484Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-f0bc5d5f-6733-47ff-aeb8-22abdea804de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0bc5d5f-6733-47ff-aeb8-22abdea804de
Content-Type: application/json

--- request body ---
{"handle":"qa-0094ddb57ee6","displayName":"QA 0094ddb57ee6","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0bc5d5f-6733-47ff-aeb8-22abdea804de
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
Location: /v1/accounts/qa-0094ddb57ee6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e7a10658-7288-4b66-b676-c93fdabe1639","handle":"qa-0094ddb57ee6","displayName":"QA 0094ddb57ee6","region":"eu","role":"user","createdAt":"2026-11-19T10:29:20.736516615Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-074f5e78-f7f2-491d-b250-42f47311433a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-074f5e78-f7f2-491d-b250-42f47311433a
Content-Type: application/json

--- request body ---
{"handle":"qa-6b49e0591f9c","password":"****"}

--- response: 200 in 47 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-074f5e78-f7f2-491d-b250-42f47311433a
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_064f6f90-3c9a-4daf-872e-887ad9347b21"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-fa3e8dfd-dad8-46d2-9ab8-41361a9eaae1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa3e8dfd-dad8-46d2-9ab8-41361a9eaae1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-eb537fbcd21e","subject":"Private","message":"Just us"}

--- response: 201 in 33 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa3e8dfd-dad8-46d2-9ab8-41361a9eaae1
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
Location: /v1/conversations/cnv_62544373-6ae0-4ea5-beb5-3b63669cf9cb
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_62544373-6ae0-4ea5-beb5-3b63669cf9cb","subject":"Private","status":"open","region":"eu","participants":["qa-6b49e0591f9c","qa-eb537fbcd21e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:20.840151263Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2b67a345-7e39-4753-ae39-1f2e40a2d2f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b67a345-7e39-4753-ae39-1f2e40a2d2f6
Content-Type: application/json

--- request body ---
{"handle":"qa-0094ddb57ee6","password":"****"}

--- response: 200 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b67a345-7e39-4753-ae39-1f2e40a2d2f6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e7a10658-7288-4b66-b676-c93fdabe1639"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_62544373-6ae0-4ea5-beb5-3b63669cf9cb
correlation: qa-24e35808-ccee-4cec-ae4a-ddd48f49b161

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24e35808-ccee-4cec-ae4a-ddd48f49b161
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-24e35808-ccee-4cec-ae4a-ddd48f49b161
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_62544373-6ae0-4ea5-beb5-3b63669cf9cb","correlationId":"qa-24e35808-ccee-4cec-ae4a-ddd48f49b161"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_62544373-6ae0-4ea5-beb5-3b63669cf9cb/messages
correlation: qa-fa8358b8-402c-41e9-b303-6a803ce14509

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa8358b8-402c-41e9-b303-6a803ce14509
Content-Type: application/json

--- response: 403 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa8358b8-402c-41e9-b303-6a803ce14509
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_62544373-6ae0-4ea5-beb5-3b63669cf9cb/messages","correlationId":"qa-fa8358b8-402c-41e9-b303-6a803ce14509"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_62544373-6ae0-4ea5-beb5-3b63669cf9cb/messages
correlation: qa-ff564dd5-63b0-4673-a5ed-f435c90bad6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff564dd5-63b0-4673-a5ed-f435c90bad6f
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ff564dd5-63b0-4673-a5ed-f435c90bad6f
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_62544373-6ae0-4ea5-beb5-3b63669cf9cb/messages","correlationId":"qa-ff564dd5-63b0-4673-a5ed-f435c90bad6f"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f43fc5d0-344c-4789-a7f6-8e964286a916

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f43fc5d0-344c-4789-a7f6-8e964286a916
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f43fc5d0-344c-4789-a7f6-8e964286a916
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
correlation: qa-143454f5-a72c-4161-8b4f-4a26bc8d2658

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-143454f5-a72c-4161-8b4f-4a26bc8d2658
Content-Type: application/json

--- request body ---
{"handle":"qa-0094ddb57ee6","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-143454f5-a72c-4161-8b4f-4a26bc8d2658
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-143454f5-a72c-4161-8b4f-4a26bc8d2658"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-539d1d3e-6490-4e30-a5ed-a959b1010957

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-539d1d3e-6490-4e30-a5ed-a959b1010957
Content-Type: application/json

--- request body ---
{"handle":"qa-eb537fbcd21e","password":"****"}

--- response: 200 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-539d1d3e-6490-4e30-a5ed-a959b1010957
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9dd80dec-18f5-479f-8f74-064c18935e18"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1143bffa-92ca-4dc0-8c58-9882445096c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1143bffa-92ca-4dc0-8c58-9882445096c8
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1143bffa-92ca-4dc0-8c58-9882445096c8
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
correlation: qa-5fcfebc4-5b27-4adc-bda2-5898d72a1bf7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fcfebc4-5b27-4adc-bda2-5898d72a1bf7
Content-Type: application/json

--- request body ---
{"handle":"qa-eb537fbcd21e","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5fcfebc4-5b27-4adc-bda2-5898d72a1bf7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5fcfebc4-5b27-4adc-bda2-5898d72a1bf7"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c2c93a45-3c74-433f-9872-22d8bdc62d4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2c93a45-3c74-433f-9872-22d8bdc62d4a
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c2c93a45-3c74-433f-9872-22d8bdc62d4a
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
correlation: qa-f2117ea9-b5b8-4a6b-8c34-4821d86ae0ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2117ea9-b5b8-4a6b-8c34-4821d86ae0ff
Content-Type: application/json

--- request body ---
{"handle":"qa-6b49e0591f9c","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2117ea9-b5b8-4a6b-8c34-4821d86ae0ff
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f2117ea9-b5b8-4a6b-8c34-4821d86ae0ff"}
```
