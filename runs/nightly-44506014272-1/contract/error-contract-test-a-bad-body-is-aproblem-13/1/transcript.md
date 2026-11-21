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
| 1 | `POST /v1/accounts` | 201 | 71 | `qa-618d2f7d-8366-45f6-849e-edf5c146c25f` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-c925242c-21f1-49bc-8045-ee502701f1cf` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-a3d870d0-d63f-4733-bd47-389612a2a7c4` |
| 4 | `POST /v1/conversations` | 201 | 38 | `qa-45a46d96-7af2-4289-9479-b9c478df60e6` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 32 | `qa-b8e88942-cb7f-4c00-90f8-35ad98c53d9d` |
| 6 | `POST /v1/auth/token` | 200 | 48 | `qa-471c97f6-d1ca-46f8-8958-cf45e7ca39ca` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-2c1ba14c-a7b8-43b5-afc8-5476b1460bae` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-97a19210-7491-4f14-ab05-e17df1df851c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-5ea3b0e9-dff2-4c76-8539-4f19b6e2a478` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-8ece0d46-bffc-4491-b438-0e889cecde96` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-618d2f7d-8366-45f6-849e-edf5c146c25f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-618d2f7d-8366-45f6-849e-edf5c146c25f
Content-Type: application/json

--- request body ---
{"handle":"qa-d5f25109737b","displayName":"QA d5f25109737b","password":"****","region":"eu"}

--- response: 201 in 71 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-618d2f7d-8366-45f6-849e-edf5c146c25f
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
Location: /v1/accounts/qa-d5f25109737b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a1614b8-19cd-46bb-b0f1-a17956475153","handle":"qa-d5f25109737b","displayName":"QA d5f25109737b","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.807507767Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c925242c-21f1-49bc-8045-ee502701f1cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c925242c-21f1-49bc-8045-ee502701f1cf
Content-Type: application/json

--- request body ---
{"handle":"qa-bc75ec512c94","displayName":"QA bc75ec512c94","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-c925242c-21f1-49bc-8045-ee502701f1cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 6
Location: /v1/accounts/qa-bc75ec512c94
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3ef19905-2b04-4e87-955c-c1e1a62774f6","handle":"qa-bc75ec512c94","displayName":"QA bc75ec512c94","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.853621355Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a3d870d0-d63f-4733-bd47-389612a2a7c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3d870d0-d63f-4733-bd47-389612a2a7c4
Content-Type: application/json

--- request body ---
{"handle":"qa-d5f25109737b","password":"****"}

--- response: 200 in 32 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3d870d0-d63f-4733-bd47-389612a2a7c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9a1614b8-19cd-46bb-b0f1-a17956475153"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-45a46d96-7af2-4289-9479-b9c478df60e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45a46d96-7af2-4289-9479-b9c478df60e6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bc75ec512c94","subject":"Error contract","message":"Hi"}

--- response: 201 in 38 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-45a46d96-7af2-4289-9479-b9c478df60e6
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
Location: /v1/conversations/cnv_3dfa575a-95f7-49e4-adc8-fdbc77a0fa99
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3dfa575a-95f7-49e4-adc8-fdbc77a0fa99","subject":"Error contract","status":"open","region":"eu","participants":["qa-d5f25109737b","qa-bc75ec512c94"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:26.959324593Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_3dfa575a-95f7-49e4-adc8-fdbc77a0fa99/messages
correlation: qa-b8e88942-cb7f-4c00-90f8-35ad98c53d9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8e88942-cb7f-4c00-90f8-35ad98c53d9d
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 32 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b8e88942-cb7f-4c00-90f8-35ad98c53d9d
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_3dfa575a-95f7-49e4-adc8-fdbc77a0fa99/messages","correlationId":"qa-b8e88942-cb7f-4c00-90f8-35ad98c53d9d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-471c97f6-d1ca-46f8-8958-cf45e7ca39ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-471c97f6-d1ca-46f8-8958-cf45e7ca39ca
Content-Type: application/json

--- request body ---
{"handle":"qa-bc75ec512c94","password":"****"}

--- response: 200 in 48 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-471c97f6-d1ca-46f8-8958-cf45e7ca39ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3ef19905-2b04-4e87-955c-c1e1a62774f6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2c1ba14c-a7b8-43b5-afc8-5476b1460bae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c1ba14c-a7b8-43b5-afc8-5476b1460bae
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2c1ba14c-a7b8-43b5-afc8-5476b1460bae
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
correlation: qa-97a19210-7491-4f14-ab05-e17df1df851c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97a19210-7491-4f14-ab05-e17df1df851c
Content-Type: application/json

--- request body ---
{"handle":"qa-bc75ec512c94","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-97a19210-7491-4f14-ab05-e17df1df851c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-97a19210-7491-4f14-ab05-e17df1df851c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5ea3b0e9-dff2-4c76-8539-4f19b6e2a478

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ea3b0e9-dff2-4c76-8539-4f19b6e2a478
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5ea3b0e9-dff2-4c76-8539-4f19b6e2a478
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
correlation: qa-8ece0d46-bffc-4491-b438-0e889cecde96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ece0d46-bffc-4491-b438-0e889cecde96
Content-Type: application/json

--- request body ---
{"handle":"qa-d5f25109737b","password":"****"}

--- response: 401 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ece0d46-bffc-4491-b438-0e889cecde96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8ece0d46-bffc-4491-b438-0e889cecde96"}
```
