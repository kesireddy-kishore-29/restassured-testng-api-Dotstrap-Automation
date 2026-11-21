# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[2]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-4e3b466d-c152-4828-bd7e-b2a9e8ebc75e` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-1280da2f-9b95-43e3-9bf9-ef9387351626` |
| 3 | `POST /v1/accounts` | 201 | 17 | `qa-f96d4ae8-8457-4206-848d-91568d487e65` |
| 4 | `POST /v1/auth/token` | 200 | 22 | `qa-b3fe30db-3a8c-428b-a05c-23ad2f2e4869` |
| 5 | `POST /v1/conversations` | 201 | 18 | `qa-ab69bab9-702f-4195-bd23-ec23e717c4d0` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-0884a6d4-d9db-4904-9139-4792acac389c` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 20 | `qa-90b8ab37-62e0-4dda-b65e-af3a72a9e8a7` |
| 8 | `DELETE /v1/accounts/me` | 204 | 53 | `qa-17904203-7d9e-48a7-8362-8c64f387b46a` |
| 9 | `POST /v1/auth/token` | 401 | 28 | `qa-c1dde8fc-7520-4ed5-bfd4-5deff3a4c2e7` |
| 10 | `POST /v1/auth/token` | 200 | 32 | `qa-905bab03-8437-48eb-9dce-60d1706386c8` |
| 11 | `DELETE /v1/accounts/me` | 204 | 33 | `qa-95185811-f25b-4b57-9c16-7b1d02809d12` |
| 12 | `POST /v1/auth/token` | 401 | 43 | `qa-d08b2391-c0ca-47a9-bc4f-6f8d7574bdbc` |
| 13 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-fcecb249-7dbf-4889-b1c2-88414ee32cb3` |
| 14 | `POST /v1/auth/token` | 401 | 39 | `qa-f4149ed3-cb8f-43a3-afa5-b0a87bf5c97b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4e3b466d-c152-4828-bd7e-b2a9e8ebc75e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e3b466d-c152-4828-bd7e-b2a9e8ebc75e
Content-Type: application/json

--- request body ---
{"handle":"qa-dbd45337780f","displayName":"QA dbd45337780f","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e3b466d-c152-4828-bd7e-b2a9e8ebc75e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 9
Location: /v1/accounts/qa-dbd45337780f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_23ba6104-e43c-4664-83b9-95ea5b8e9290","handle":"qa-dbd45337780f","displayName":"QA dbd45337780f","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.715131744Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1280da2f-9b95-43e3-9bf9-ef9387351626

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1280da2f-9b95-43e3-9bf9-ef9387351626
Content-Type: application/json

--- request body ---
{"handle":"qa-93b2e41b3105","displayName":"QA 93b2e41b3105","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-1280da2f-9b95-43e3-9bf9-ef9387351626
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 9
Location: /v1/accounts/qa-93b2e41b3105
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c992b7c7-6fba-4c5a-a1b8-e0e2bde48d1a","handle":"qa-93b2e41b3105","displayName":"QA 93b2e41b3105","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.755373674Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-f96d4ae8-8457-4206-848d-91568d487e65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f96d4ae8-8457-4206-848d-91568d487e65
Content-Type: application/json

--- request body ---
{"handle":"qa-714ff11d2017","displayName":"QA 714ff11d2017","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f96d4ae8-8457-4206-848d-91568d487e65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 9
Location: /v1/accounts/qa-714ff11d2017
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1b3eaf84-fba6-4d0b-acc7-3ee54a7dd50e","handle":"qa-714ff11d2017","displayName":"QA 714ff11d2017","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.780082959Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-b3fe30db-3a8c-428b-a05c-23ad2f2e4869

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3fe30db-3a8c-428b-a05c-23ad2f2e4869
Content-Type: application/json

--- request body ---
{"handle":"qa-dbd45337780f","password":"****"}

--- response: 200 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3fe30db-3a8c-428b-a05c-23ad2f2e4869
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_23ba6104-e43c-4664-83b9-95ea5b8e9290"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-ab69bab9-702f-4195-bd23-ec23e717c4d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab69bab9-702f-4195-bd23-ec23e717c4d0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-93b2e41b3105","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab69bab9-702f-4195-bd23-ec23e717c4d0
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
Location: /v1/conversations/cnv_62e38f21-515a-43cf-8bd6-0e194af39939
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_62e38f21-515a-43cf-8bd6-0e194af39939","subject":"Error contract","status":"open","region":"eu","participants":["qa-dbd45337780f","qa-93b2e41b3105"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:00.835721919Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0884a6d4-d9db-4904-9139-4792acac389c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0884a6d4-d9db-4904-9139-4792acac389c
Content-Type: application/json

--- request body ---
{"handle":"qa-714ff11d2017","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-0884a6d4-d9db-4904-9139-4792acac389c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1b3eaf84-fba6-4d0b-acc7-3ee54a7dd50e"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_62e38f21-515a-43cf-8bd6-0e194af39939/messages
correlation: qa-90b8ab37-62e0-4dda-b65e-af3a72a9e8a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90b8ab37-62e0-4dda-b65e-af3a72a9e8a7
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 20 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90b8ab37-62e0-4dda-b65e-af3a72a9e8a7
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_62e38f21-515a-43cf-8bd6-0e194af39939/messages","correlationId":"qa-90b8ab37-62e0-4dda-b65e-af3a72a9e8a7"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-17904203-7d9e-48a7-8362-8c64f387b46a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17904203-7d9e-48a7-8362-8c64f387b46a
Content-Type: application/json

--- response: 204 in 53 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-17904203-7d9e-48a7-8362-8c64f387b46a
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
correlation: qa-c1dde8fc-7520-4ed5-bfd4-5deff3a4c2e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1dde8fc-7520-4ed5-bfd4-5deff3a4c2e7
Content-Type: application/json

--- request body ---
{"handle":"qa-714ff11d2017","password":"****"}

--- response: 401 in 28 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1dde8fc-7520-4ed5-bfd4-5deff3a4c2e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c1dde8fc-7520-4ed5-bfd4-5deff3a4c2e7"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-905bab03-8437-48eb-9dce-60d1706386c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-905bab03-8437-48eb-9dce-60d1706386c8
Content-Type: application/json

--- request body ---
{"handle":"qa-93b2e41b3105","password":"****"}

--- response: 200 in 32 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-905bab03-8437-48eb-9dce-60d1706386c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c992b7c7-6fba-4c5a-a1b8-e0e2bde48d1a"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-95185811-f25b-4b57-9c16-7b1d02809d12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95185811-f25b-4b57-9c16-7b1d02809d12
Content-Type: application/json

--- response: 204 in 33 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-95185811-f25b-4b57-9c16-7b1d02809d12
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
correlation: qa-d08b2391-c0ca-47a9-bc4f-6f8d7574bdbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d08b2391-c0ca-47a9-bc4f-6f8d7574bdbc
Content-Type: application/json

--- request body ---
{"handle":"qa-93b2e41b3105","password":"****"}

--- response: 401 in 43 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d08b2391-c0ca-47a9-bc4f-6f8d7574bdbc
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d08b2391-c0ca-47a9-bc4f-6f8d7574bdbc"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fcecb249-7dbf-4889-b1c2-88414ee32cb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcecb249-7dbf-4889-b1c2-88414ee32cb3
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fcecb249-7dbf-4889-b1c2-88414ee32cb3
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
correlation: qa-f4149ed3-cb8f-43a3-afa5-b0a87bf5c97b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4149ed3-cb8f-43a3-afa5-b0a87bf5c97b
Content-Type: application/json

--- request body ---
{"handle":"qa-dbd45337780f","password":"****"}

--- response: 401 in 39 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4149ed3-cb8f-43a3-afa5-b0a87bf5c97b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f4149ed3-cb8f-43a3-afa5-b0a87bf5c97b"}
```
