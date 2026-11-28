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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-1df1f2b5-a0cf-4e98-868d-a1c126d68594` |
| 2 | `POST /v1/accounts` | 201 | 48 | `qa-24eb565c-9d2a-4814-82b7-f4ada577ad60` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-bdbd2484-fd01-4894-9197-cb27fb76c6a5` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-d0628cfd-07b0-4b65-894e-c24824eb80ab` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 48 | `qa-83100fa6-5d34-45ad-9869-6255b63500f4` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-00dad2be-57ea-407d-be1c-60b76b92ed97` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-1fb7b1c4-a188-474a-8b9f-69a53945279e` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-02316d7d-6d7e-4d55-b259-68d87e8107e4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-d1237f32-d241-42c1-ad50-d7dbf8bf4e5a` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-de159f90-606d-4542-a300-aba8d790b102` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1df1f2b5-a0cf-4e98-868d-a1c126d68594

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1df1f2b5-a0cf-4e98-868d-a1c126d68594
Content-Type: application/json

--- request body ---
{"handle":"qa-2bf769815f36","displayName":"QA 2bf769815f36","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-1df1f2b5-a0cf-4e98-868d-a1c126d68594
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 7
Location: /v1/accounts/qa-2bf769815f36
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f0567793-707a-4290-bb2a-e76402b37265","handle":"qa-2bf769815f36","displayName":"QA 2bf769815f36","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.655508862Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-24eb565c-9d2a-4814-82b7-f4ada577ad60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24eb565c-9d2a-4814-82b7-f4ada577ad60
Content-Type: application/json

--- request body ---
{"handle":"qa-e24f9c0ebc74","displayName":"QA e24f9c0ebc74","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-24eb565c-9d2a-4814-82b7-f4ada577ad60
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 7
Location: /v1/accounts/qa-e24f9c0ebc74
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c8926f5a-1846-449d-850c-41b2a3dff319","handle":"qa-e24f9c0ebc74","displayName":"QA e24f9c0ebc74","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.714720093Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bdbd2484-fd01-4894-9197-cb27fb76c6a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdbd2484-fd01-4894-9197-cb27fb76c6a5
Content-Type: application/json

--- request body ---
{"handle":"qa-2bf769815f36","password":"****"}

--- response: 200 in 33 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdbd2484-fd01-4894-9197-cb27fb76c6a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f0567793-707a-4290-bb2a-e76402b37265"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d0628cfd-07b0-4b65-894e-c24824eb80ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0628cfd-07b0-4b65-894e-c24824eb80ab
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e24f9c0ebc74","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0628cfd-07b0-4b65-894e-c24824eb80ab
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
Location: /v1/conversations/cnv_2f49b7f4-e010-4d74-b235-591efdb5b83b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2f49b7f4-e010-4d74-b235-591efdb5b83b","subject":"Error contract","status":"open","region":"eu","participants":["qa-2bf769815f36","qa-e24f9c0ebc74"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:59.807903313Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_2f49b7f4-e010-4d74-b235-591efdb5b83b/messages
correlation: qa-83100fa6-5d34-45ad-9869-6255b63500f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83100fa6-5d34-45ad-9869-6255b63500f4
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 48 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-83100fa6-5d34-45ad-9869-6255b63500f4
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_2f49b7f4-e010-4d74-b235-591efdb5b83b/messages","correlationId":"qa-83100fa6-5d34-45ad-9869-6255b63500f4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-00dad2be-57ea-407d-be1c-60b76b92ed97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00dad2be-57ea-407d-be1c-60b76b92ed97
Content-Type: application/json

--- request body ---
{"handle":"qa-e24f9c0ebc74","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-00dad2be-57ea-407d-be1c-60b76b92ed97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c8926f5a-1846-449d-850c-41b2a3dff319"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1fb7b1c4-a188-474a-8b9f-69a53945279e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fb7b1c4-a188-474a-8b9f-69a53945279e
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1fb7b1c4-a188-474a-8b9f-69a53945279e
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
correlation: qa-02316d7d-6d7e-4d55-b259-68d87e8107e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02316d7d-6d7e-4d55-b259-68d87e8107e4
Content-Type: application/json

--- request body ---
{"handle":"qa-e24f9c0ebc74","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-02316d7d-6d7e-4d55-b259-68d87e8107e4
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-02316d7d-6d7e-4d55-b259-68d87e8107e4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d1237f32-d241-42c1-ad50-d7dbf8bf4e5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1237f32-d241-42c1-ad50-d7dbf8bf4e5a
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d1237f32-d241-42c1-ad50-d7dbf8bf4e5a
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
correlation: qa-de159f90-606d-4542-a300-aba8d790b102

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de159f90-606d-4542-a300-aba8d790b102
Content-Type: application/json

--- request body ---
{"handle":"qa-2bf769815f36","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-de159f90-606d-4542-a300-aba8d790b102
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-de159f90-606d-4542-a300-aba8d790b102"}
```
