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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-aed0eb17-da15-41f3-947b-f0f99fc444dd` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-ed6b66e1-d484-4dac-ac3d-5bf9d736d27c` |
| 3 | `POST /v1/accounts` | 201 | 25 | `qa-e4d23161-2ff6-4713-a418-dff64a311d1b` |
| 4 | `POST /v1/auth/token` | 200 | 40 | `qa-d27dee94-72df-48be-acee-2ebb95ab84e0` |
| 5 | `POST /v1/conversations` | 201 | 33 | `qa-908f8b6b-3e73-47b5-ba02-427e6df4ab65` |
| 6 | `POST /v1/auth/token` | 200 | 10 | `qa-e20502e9-124f-4019-a34c-bf7ad0fcdb7b` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 7 | `qa-3da0effe-4dec-40ab-94a0-885ccc6f394e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-98536b1d-31aa-493a-aed8-4862415f8855` |
| 9 | `POST /v1/auth/token` | 401 | 21 | `qa-05c3a74b-4a75-44de-a846-686bd07f6827` |
| 10 | `POST /v1/auth/token` | 200 | 60 | `qa-d029842c-88d2-4ea9-bf5f-089f65ae29d7` |
| 11 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-b8bfd960-9759-4858-be59-a270ca083ef8` |
| 12 | `POST /v1/auth/token` | 401 | 23 | `qa-e0373c90-945b-4805-a5b6-13f7632d4b30` |
| 13 | `DELETE /v1/accounts/me` | 204 | 40 | `qa-ca11f108-1f0a-4866-8664-7025ca74dcba` |
| 14 | `POST /v1/auth/token` | 401 | 98 | `qa-7933e2c0-d92b-4c15-ac70-b2e235c1fda5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aed0eb17-da15-41f3-947b-f0f99fc444dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aed0eb17-da15-41f3-947b-f0f99fc444dd
Content-Type: application/json

--- request body ---
{"handle":"qa-40de4cc42912","displayName":"QA 40de4cc42912","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-aed0eb17-da15-41f3-947b-f0f99fc444dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Location: /v1/accounts/qa-40de4cc42912
X-Served-Region: eu
Content-Length: 181

{"id":"acc_36976b9e-0880-46ac-95ce-5c1afd677bb8","handle":"qa-40de4cc42912","displayName":"QA 40de4cc42912","region":"eu","role":"user","createdAt":"2026-11-05T09:37:54.077874601Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ed6b66e1-d484-4dac-ac3d-5bf9d736d27c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed6b66e1-d484-4dac-ac3d-5bf9d736d27c
Content-Type: application/json

--- request body ---
{"handle":"qa-f22c0bf25190","displayName":"QA f22c0bf25190","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed6b66e1-d484-4dac-ac3d-5bf9d736d27c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Location: /v1/accounts/qa-f22c0bf25190
X-Served-Region: eu
Content-Length: 181

{"id":"acc_854367d3-2102-4870-8a26-23ce0c88289d","handle":"qa-f22c0bf25190","displayName":"QA f22c0bf25190","region":"eu","role":"user","createdAt":"2026-11-05T09:37:54.116429146Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-e4d23161-2ff6-4713-a418-dff64a311d1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4d23161-2ff6-4713-a418-dff64a311d1b
Content-Type: application/json

--- request body ---
{"handle":"qa-5387d5161192","displayName":"QA 5387d5161192","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4d23161-2ff6-4713-a418-dff64a311d1b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 9
Location: /v1/accounts/qa-5387d5161192
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c3cdd5ca-c01e-4d18-8b40-019f2ee33c0d","handle":"qa-5387d5161192","displayName":"QA 5387d5161192","region":"eu","role":"user","createdAt":"2026-11-05T09:37:54.157170633Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-d27dee94-72df-48be-acee-2ebb95ab84e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d27dee94-72df-48be-acee-2ebb95ab84e0
Content-Type: application/json

--- request body ---
{"handle":"qa-40de4cc42912","password":"****"}

--- response: 200 in 40 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-d27dee94-72df-48be-acee-2ebb95ab84e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_36976b9e-0880-46ac-95ce-5c1afd677bb8"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-908f8b6b-3e73-47b5-ba02-427e6df4ab65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-908f8b6b-3e73-47b5-ba02-427e6df4ab65
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f22c0bf25190","subject":"Error contract","message":"Hi"}

--- response: 201 in 33 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-908f8b6b-3e73-47b5-ba02-427e6df4ab65
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
Location: /v1/conversations/cnv_53e933c0-58fd-413f-b88f-b6f936fe8a94
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_53e933c0-58fd-413f-b88f-b6f936fe8a94","subject":"Error contract","status":"open","region":"eu","participants":["qa-40de4cc42912","qa-f22c0bf25190"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:54.236169127Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e20502e9-124f-4019-a34c-bf7ad0fcdb7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e20502e9-124f-4019-a34c-bf7ad0fcdb7b
Content-Type: application/json

--- request body ---
{"handle":"qa-5387d5161192","password":"****"}

--- response: 200 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-e20502e9-124f-4019-a34c-bf7ad0fcdb7b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c3cdd5ca-c01e-4d18-8b40-019f2ee33c0d"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_53e933c0-58fd-413f-b88f-b6f936fe8a94/messages
correlation: qa-3da0effe-4dec-40ab-94a0-885ccc6f394e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3da0effe-4dec-40ab-94a0-885ccc6f394e
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3da0effe-4dec-40ab-94a0-885ccc6f394e
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_53e933c0-58fd-413f-b88f-b6f936fe8a94/messages","correlationId":"qa-3da0effe-4dec-40ab-94a0-885ccc6f394e"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-98536b1d-31aa-493a-aed8-4862415f8855

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98536b1d-31aa-493a-aed8-4862415f8855
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-98536b1d-31aa-493a-aed8-4862415f8855
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
correlation: qa-05c3a74b-4a75-44de-a846-686bd07f6827

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05c3a74b-4a75-44de-a846-686bd07f6827
Content-Type: application/json

--- request body ---
{"handle":"qa-5387d5161192","password":"****"}

--- response: 401 in 21 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05c3a74b-4a75-44de-a846-686bd07f6827
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-05c3a74b-4a75-44de-a846-686bd07f6827"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-d029842c-88d2-4ea9-bf5f-089f65ae29d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d029842c-88d2-4ea9-bf5f-089f65ae29d7
Content-Type: application/json

--- request body ---
{"handle":"qa-f22c0bf25190","password":"****"}

--- response: 200 in 60 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-d029842c-88d2-4ea9-bf5f-089f65ae29d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_854367d3-2102-4870-8a26-23ce0c88289d"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b8bfd960-9759-4858-be59-a270ca083ef8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8bfd960-9759-4858-be59-a270ca083ef8
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b8bfd960-9759-4858-be59-a270ca083ef8
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
correlation: qa-e0373c90-945b-4805-a5b6-13f7632d4b30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0373c90-945b-4805-a5b6-13f7632d4b30
Content-Type: application/json

--- request body ---
{"handle":"qa-f22c0bf25190","password":"****"}

--- response: 401 in 23 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e0373c90-945b-4805-a5b6-13f7632d4b30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e0373c90-945b-4805-a5b6-13f7632d4b30"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ca11f108-1f0a-4866-8664-7025ca74dcba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca11f108-1f0a-4866-8664-7025ca74dcba
Content-Type: application/json

--- response: 204 in 40 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ca11f108-1f0a-4866-8664-7025ca74dcba
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
correlation: qa-7933e2c0-d92b-4c15-ac70-b2e235c1fda5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7933e2c0-d92b-4c15-ac70-b2e235c1fda5
Content-Type: application/json

--- request body ---
{"handle":"qa-40de4cc42912","password":"****"}

--- response: 401 in 98 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7933e2c0-d92b-4c15-ac70-b2e235c1fda5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7933e2c0-d92b-4c15-ac70-b2e235c1fda5"}
```
