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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-e9bbe973-0f6a-4cd2-92f6-950676f83a24` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-0af5ff3f-bbba-40ab-b4f6-943af11d5bfd` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-0fbda735-ac7a-45c7-9165-2b2adfe88347` |
| 4 | `POST /v1/conversations` | 201 | 31 | `qa-2105666b-87ce-4ba8-9024-6e8bd05ce969` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 35 | `qa-aeb63711-28ac-4dc7-ad94-2d8578c6f1cc` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-9ddefba3-a2df-4469-ad2f-a8e3dcddf482` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-27531170-e127-4828-ba93-20c19427f638` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-d16e79f9-d1f9-4516-be6f-edfaa8da9c2f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-2ce7fe43-3d12-4564-aeec-b2bf006fb1e0` |
| 10 | `POST /v1/auth/token` | 401 | 30 | `qa-2919899e-57be-4a93-8301-c9b6b63a423f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e9bbe973-0f6a-4cd2-92f6-950676f83a24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9bbe973-0f6a-4cd2-92f6-950676f83a24
Content-Type: application/json

--- request body ---
{"handle":"qa-a0303407dedd","displayName":"QA a0303407dedd","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9bbe973-0f6a-4cd2-92f6-950676f83a24
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 6
Location: /v1/accounts/qa-a0303407dedd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_60cdb467-df5e-4306-93af-a09b74fde42f","handle":"qa-a0303407dedd","displayName":"QA a0303407dedd","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.106432922Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0af5ff3f-bbba-40ab-b4f6-943af11d5bfd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0af5ff3f-bbba-40ab-b4f6-943af11d5bfd
Content-Type: application/json

--- request body ---
{"handle":"qa-d08aab5091fc","displayName":"QA d08aab5091fc","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-0af5ff3f-bbba-40ab-b4f6-943af11d5bfd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 6
Location: /v1/accounts/qa-d08aab5091fc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7e64669f-ba9b-4826-91d3-fcd6d7978346","handle":"qa-d08aab5091fc","displayName":"QA d08aab5091fc","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.160423200Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0fbda735-ac7a-45c7-9165-2b2adfe88347

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fbda735-ac7a-45c7-9165-2b2adfe88347
Content-Type: application/json

--- request body ---
{"handle":"qa-a0303407dedd","password":"****"}

--- response: 200 in 39 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fbda735-ac7a-45c7-9165-2b2adfe88347
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_60cdb467-df5e-4306-93af-a09b74fde42f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2105666b-87ce-4ba8-9024-6e8bd05ce969

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2105666b-87ce-4ba8-9024-6e8bd05ce969
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d08aab5091fc","subject":"Error contract","message":"Hi"}

--- response: 201 in 31 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-2105666b-87ce-4ba8-9024-6e8bd05ce969
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
Location: /v1/conversations/cnv_98de691e-36f4-416f-b475-81df84000a63
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_98de691e-36f4-416f-b475-81df84000a63","subject":"Error contract","status":"open","region":"eu","participants":["qa-a0303407dedd","qa-d08aab5091fc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:34.289680259Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_98de691e-36f4-416f-b475-81df84000a63/messages
correlation: qa-aeb63711-28ac-4dc7-ad94-2d8578c6f1cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aeb63711-28ac-4dc7-ad94-2d8578c6f1cc
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 35 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aeb63711-28ac-4dc7-ad94-2d8578c6f1cc
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_98de691e-36f4-416f-b475-81df84000a63/messages","correlationId":"qa-aeb63711-28ac-4dc7-ad94-2d8578c6f1cc"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9ddefba3-a2df-4469-ad2f-a8e3dcddf482

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ddefba3-a2df-4469-ad2f-a8e3dcddf482
Content-Type: application/json

--- request body ---
{"handle":"qa-d08aab5091fc","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ddefba3-a2df-4469-ad2f-a8e3dcddf482
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7e64669f-ba9b-4826-91d3-fcd6d7978346"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-27531170-e127-4828-ba93-20c19427f638

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27531170-e127-4828-ba93-20c19427f638
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-27531170-e127-4828-ba93-20c19427f638
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
correlation: qa-d16e79f9-d1f9-4516-be6f-edfaa8da9c2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d16e79f9-d1f9-4516-be6f-edfaa8da9c2f
Content-Type: application/json

--- request body ---
{"handle":"qa-d08aab5091fc","password":"****"}

--- response: 401 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d16e79f9-d1f9-4516-be6f-edfaa8da9c2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d16e79f9-d1f9-4516-be6f-edfaa8da9c2f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2ce7fe43-3d12-4564-aeec-b2bf006fb1e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ce7fe43-3d12-4564-aeec-b2bf006fb1e0
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2ce7fe43-3d12-4564-aeec-b2bf006fb1e0
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
correlation: qa-2919899e-57be-4a93-8301-c9b6b63a423f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2919899e-57be-4a93-8301-c9b6b63a423f
Content-Type: application/json

--- request body ---
{"handle":"qa-a0303407dedd","password":"****"}

--- response: 401 in 30 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2919899e-57be-4a93-8301-c9b6b63a423f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2919899e-57be-4a93-8301-c9b6b63a423f"}
```
