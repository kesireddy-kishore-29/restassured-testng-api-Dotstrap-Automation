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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-bfa16d24-abaa-4721-a79d-1a37ea26f91d` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-17490681-5aa3-48b4-97dd-159193548835` |
| 3 | `POST /v1/accounts` | 201 | 29 | `qa-b5da698c-d3a3-4e67-9d54-1226ba82f4e5` |
| 4 | `POST /v1/auth/token` | 200 | 15 | `qa-a3c97da1-6d0a-4092-a044-a6abc0848d78` |
| 5 | `POST /v1/conversations` | 201 | 6 | `qa-9b0061bd-eb1f-438f-8644-cef2138ea715` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-085ad34f-b12c-4869-811b-33e0e8edea83` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 14 | `qa-fd0feae6-6c80-416b-b8eb-59d0edd3f778` |
| 8 | `DELETE /v1/accounts/me` | 204 | 42 | `qa-bea5689b-65d5-44f6-acc1-673068c64c71` |
| 9 | `POST /v1/auth/token` | 401 | 27 | `qa-de196fa7-5ac8-42bc-aff7-a8f385d9f779` |
| 10 | `POST /v1/auth/token` | 200 | 38 | `qa-a336faa5-2f18-4808-8f52-ae403e752e15` |
| 11 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-ad1ba610-5b45-4a36-8a25-810e0204dff8` |
| 12 | `POST /v1/auth/token` | 401 | 30 | `qa-057701f8-ff63-431e-93e0-628341c950d3` |
| 13 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-97fc078c-2dc0-42a0-9b26-71fb88005582` |
| 14 | `POST /v1/auth/token` | 401 | 41 | `qa-2d99ac78-a5d5-4596-9d0d-f044ab71ca5b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bfa16d24-abaa-4721-a79d-1a37ea26f91d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfa16d24-abaa-4721-a79d-1a37ea26f91d
Content-Type: application/json

--- request body ---
{"handle":"qa-8b981c95f1dd","displayName":"QA 8b981c95f1dd","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfa16d24-abaa-4721-a79d-1a37ea26f91d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 9
Location: /v1/accounts/qa-8b981c95f1dd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c856edca-f78d-4db2-ba69-6f5edd742f73","handle":"qa-8b981c95f1dd","displayName":"QA 8b981c95f1dd","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.691984189Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-17490681-5aa3-48b4-97dd-159193548835

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17490681-5aa3-48b4-97dd-159193548835
Content-Type: application/json

--- request body ---
{"handle":"qa-0e8147bacd9d","displayName":"QA 0e8147bacd9d","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-17490681-5aa3-48b4-97dd-159193548835
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
Location: /v1/accounts/qa-0e8147bacd9d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2f0456de-1bb3-465b-bf73-d1d0c4ed4f61","handle":"qa-0e8147bacd9d","displayName":"QA 0e8147bacd9d","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.729562864Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-b5da698c-d3a3-4e67-9d54-1226ba82f4e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5da698c-d3a3-4e67-9d54-1226ba82f4e5
Content-Type: application/json

--- request body ---
{"handle":"qa-1944e090f1c9","displayName":"QA 1944e090f1c9","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5da698c-d3a3-4e67-9d54-1226ba82f4e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Location: /v1/accounts/qa-1944e090f1c9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8ff3152d-4888-4747-9e78-5dc0f30aa595","handle":"qa-1944e090f1c9","displayName":"QA 1944e090f1c9","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.766089904Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-a3c97da1-6d0a-4092-a044-a6abc0848d78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3c97da1-6d0a-4092-a044-a6abc0848d78
Content-Type: application/json

--- request body ---
{"handle":"qa-8b981c95f1dd","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3c97da1-6d0a-4092-a044-a6abc0848d78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c856edca-f78d-4db2-ba69-6f5edd742f73"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-9b0061bd-eb1f-438f-8644-cef2138ea715

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b0061bd-eb1f-438f-8644-cef2138ea715
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0e8147bacd9d","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b0061bd-eb1f-438f-8644-cef2138ea715
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
Location: /v1/conversations/cnv_c5b7f288-3b51-4af6-a511-9e7a9388bef9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c5b7f288-3b51-4af6-a511-9e7a9388bef9","subject":"Error contract","status":"open","region":"eu","participants":["qa-8b981c95f1dd","qa-0e8147bacd9d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:50.824432166Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-085ad34f-b12c-4869-811b-33e0e8edea83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-085ad34f-b12c-4869-811b-33e0e8edea83
Content-Type: application/json

--- request body ---
{"handle":"qa-1944e090f1c9","password":"****"}

--- response: 200 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-085ad34f-b12c-4869-811b-33e0e8edea83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8ff3152d-4888-4747-9e78-5dc0f30aa595"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_c5b7f288-3b51-4af6-a511-9e7a9388bef9/messages
correlation: qa-fd0feae6-6c80-416b-b8eb-59d0edd3f778

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd0feae6-6c80-416b-b8eb-59d0edd3f778
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd0feae6-6c80-416b-b8eb-59d0edd3f778
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_c5b7f288-3b51-4af6-a511-9e7a9388bef9/messages","correlationId":"qa-fd0feae6-6c80-416b-b8eb-59d0edd3f778"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bea5689b-65d5-44f6-acc1-673068c64c71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bea5689b-65d5-44f6-acc1-673068c64c71
Content-Type: application/json

--- response: 204 in 42 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bea5689b-65d5-44f6-acc1-673068c64c71
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
correlation: qa-de196fa7-5ac8-42bc-aff7-a8f385d9f779

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de196fa7-5ac8-42bc-aff7-a8f385d9f779
Content-Type: application/json

--- request body ---
{"handle":"qa-1944e090f1c9","password":"****"}

--- response: 401 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-de196fa7-5ac8-42bc-aff7-a8f385d9f779
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-de196fa7-5ac8-42bc-aff7-a8f385d9f779"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-a336faa5-2f18-4808-8f52-ae403e752e15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a336faa5-2f18-4808-8f52-ae403e752e15
Content-Type: application/json

--- request body ---
{"handle":"qa-0e8147bacd9d","password":"****"}

--- response: 200 in 38 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-a336faa5-2f18-4808-8f52-ae403e752e15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2f0456de-1bb3-465b-bf73-d1d0c4ed4f61"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ad1ba610-5b45-4a36-8a25-810e0204dff8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad1ba610-5b45-4a36-8a25-810e0204dff8
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ad1ba610-5b45-4a36-8a25-810e0204dff8
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
correlation: qa-057701f8-ff63-431e-93e0-628341c950d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-057701f8-ff63-431e-93e0-628341c950d3
Content-Type: application/json

--- request body ---
{"handle":"qa-0e8147bacd9d","password":"****"}

--- response: 401 in 30 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-057701f8-ff63-431e-93e0-628341c950d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-057701f8-ff63-431e-93e0-628341c950d3"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-97fc078c-2dc0-42a0-9b26-71fb88005582

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97fc078c-2dc0-42a0-9b26-71fb88005582
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-97fc078c-2dc0-42a0-9b26-71fb88005582
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
correlation: qa-2d99ac78-a5d5-4596-9d0d-f044ab71ca5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d99ac78-a5d5-4596-9d0d-f044ab71ca5b
Content-Type: application/json

--- request body ---
{"handle":"qa-8b981c95f1dd","password":"****"}

--- response: 401 in 41 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d99ac78-a5d5-4596-9d0d-f044ab71ca5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2d99ac78-a5d5-4596-9d0d-f044ab71ca5b"}
```
