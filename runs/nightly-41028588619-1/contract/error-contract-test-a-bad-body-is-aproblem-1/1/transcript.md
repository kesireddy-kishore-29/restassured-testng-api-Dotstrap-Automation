# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 523 | `qa-4b31aecc-5dbf-45f8-ab53-6cf61ec9da79` |
| 2 | `POST /v1/accounts` | 201 | 66 | `qa-a622a35f-9768-46e5-8325-d231ff5f7f6a` |
| 3 | `POST /v1/auth/token` | 200 | 97 | `qa-632551c5-a193-4fbe-93c5-223bb64f6900` |
| 4 | `POST /v1/conversations` | 201 | 102 | `qa-e10d0d7e-01b7-429c-a01b-e3f588620a5c` |
| 5 | `POST /v1/auth/token` | 415 | 47 | `qa-df5948c4-8605-4534-9a19-830aba1f3ef0` |
| 6 | `POST /v1/auth/token` | 200 | 51 | `qa-688c1065-e037-4241-969d-8c3dff0a19b1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 75 | `qa-9a8b321e-2d59-43cf-9ca0-9203fc5c6381` |
| 8 | `POST /v1/auth/token` | 401 | 60 | `qa-407f4a6b-4458-4182-b699-c4e8ca96aef6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 47 | `qa-5dc24528-cd65-4a19-9c9f-790bef71cd43` |
| 10 | `POST /v1/auth/token` | 401 | 45 | `qa-5ae9b543-09d0-491e-a7ec-03c1db4dbf6c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4b31aecc-5dbf-45f8-ab53-6cf61ec9da79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b31aecc-5dbf-45f8-ab53-6cf61ec9da79
Content-Type: application/json

--- request body ---
{"handle":"qa-24a5ef3f49bd","displayName":"QA 24a5ef3f49bd","password":"****","region":"eu"}

--- response: 201 in 523 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b31aecc-5dbf-45f8-ab53-6cf61ec9da79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Location: /v1/accounts/qa-24a5ef3f49bd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bf7e47b5-9b2e-4ef7-82cf-ed0ab7ef6dc8","handle":"qa-24a5ef3f49bd","displayName":"QA 24a5ef3f49bd","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.395139776Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a622a35f-9768-46e5-8325-d231ff5f7f6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a622a35f-9768-46e5-8325-d231ff5f7f6a
Content-Type: application/json

--- request body ---
{"handle":"qa-b1b7a9b6b15f","displayName":"QA b1b7a9b6b15f","password":"****","region":"eu"}

--- response: 201 in 66 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-a622a35f-9768-46e5-8325-d231ff5f7f6a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Location: /v1/accounts/qa-b1b7a9b6b15f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6f665db8-3453-46ca-9313-59aa0d3e565e","handle":"qa-b1b7a9b6b15f","displayName":"QA b1b7a9b6b15f","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.866994290Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-632551c5-a193-4fbe-93c5-223bb64f6900

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-632551c5-a193-4fbe-93c5-223bb64f6900
Content-Type: application/json

--- request body ---
{"handle":"qa-24a5ef3f49bd","password":"****"}

--- response: 200 in 97 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-632551c5-a193-4fbe-93c5-223bb64f6900
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bf7e47b5-9b2e-4ef7-82cf-ed0ab7ef6dc8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e10d0d7e-01b7-429c-a01b-e3f588620a5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e10d0d7e-01b7-429c-a01b-e3f588620a5c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b1b7a9b6b15f","subject":"Error contract","message":"Hi"}

--- response: 201 in 102 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-e10d0d7e-01b7-429c-a01b-e3f588620a5c
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
Location: /v1/conversations/cnv_0b9864bc-52ce-41ef-90eb-a1a0f70f18ca
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0b9864bc-52ce-41ef-90eb-a1a0f70f18ca","subject":"Error contract","status":"open","region":"eu","participants":["qa-24a5ef3f49bd","qa-b1b7a9b6b15f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:02.200392963Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-df5948c4-8605-4534-9a19-830aba1f3ef0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df5948c4-8605-4534-9a19-830aba1f3ef0
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 47 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df5948c4-8605-4534-9a19-830aba1f3ef0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-df5948c4-8605-4534-9a19-830aba1f3ef0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-688c1065-e037-4241-969d-8c3dff0a19b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-688c1065-e037-4241-969d-8c3dff0a19b1
Content-Type: application/json

--- request body ---
{"handle":"qa-b1b7a9b6b15f","password":"****"}

--- response: 200 in 51 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-688c1065-e037-4241-969d-8c3dff0a19b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6f665db8-3453-46ca-9313-59aa0d3e565e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9a8b321e-2d59-43cf-9ca0-9203fc5c6381

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a8b321e-2d59-43cf-9ca0-9203fc5c6381
Content-Type: application/json

--- response: 204 in 75 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9a8b321e-2d59-43cf-9ca0-9203fc5c6381
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
correlation: qa-407f4a6b-4458-4182-b699-c4e8ca96aef6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-407f4a6b-4458-4182-b699-c4e8ca96aef6
Content-Type: application/json

--- request body ---
{"handle":"qa-b1b7a9b6b15f","password":"****"}

--- response: 401 in 60 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-407f4a6b-4458-4182-b699-c4e8ca96aef6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-407f4a6b-4458-4182-b699-c4e8ca96aef6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5dc24528-cd65-4a19-9c9f-790bef71cd43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dc24528-cd65-4a19-9c9f-790bef71cd43
Content-Type: application/json

--- response: 204 in 47 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5dc24528-cd65-4a19-9c9f-790bef71cd43
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-5ae9b543-09d0-491e-a7ec-03c1db4dbf6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ae9b543-09d0-491e-a7ec-03c1db4dbf6c
Content-Type: application/json

--- request body ---
{"handle":"qa-24a5ef3f49bd","password":"****"}

--- response: 401 in 45 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ae9b543-09d0-491e-a7ec-03c1db4dbf6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5ae9b543-09d0-491e-a7ec-03c1db4dbf6c"}
```
