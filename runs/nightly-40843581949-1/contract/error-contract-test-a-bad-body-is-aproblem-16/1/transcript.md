# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-54d4cb50-e377-46bf-bb6d-3c65749b67f0` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-f0aa41f1-ea17-426b-aa13-ba4f7fd25fad` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-dc4f69ae-9588-4dbe-9a06-407396acfd90` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-92a544b8-5231-4434-bd69-e1f9dc7af0c5` |
| 5 | `POST /v1/credits/purchases` | 415 | 15 | `qa-51c8f9c9-5935-4bfd-998e-1e171774f98b` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-4a733595-7db7-47c1-abf1-739c7bac75e0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-ee7ef02b-b996-48a3-88f0-692ac04a4102` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-8612d704-1357-4691-8bbc-6c0dea562821` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-c79f71c9-6f41-499e-adde-a775a59b3625` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-7ec6d7e4-1742-42a2-a8ea-4ba97234dccc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-54d4cb50-e377-46bf-bb6d-3c65749b67f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54d4cb50-e377-46bf-bb6d-3c65749b67f0
Content-Type: application/json

--- request body ---
{"handle":"qa-becc28f3910b","displayName":"QA becc28f3910b","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-54d4cb50-e377-46bf-bb6d-3c65749b67f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 7
Location: /v1/accounts/qa-becc28f3910b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6df25f3c-f578-4afd-b64b-46e10715d4d2","handle":"qa-becc28f3910b","displayName":"QA becc28f3910b","region":"eu","role":"user","createdAt":"2026-10-29T08:39:01.356846341Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f0aa41f1-ea17-426b-aa13-ba4f7fd25fad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0aa41f1-ea17-426b-aa13-ba4f7fd25fad
Content-Type: application/json

--- request body ---
{"handle":"qa-50de74fdf13a","displayName":"QA 50de74fdf13a","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0aa41f1-ea17-426b-aa13-ba4f7fd25fad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 7
Location: /v1/accounts/qa-50de74fdf13a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d7251d66-61bd-4166-98fb-bda98ce672bf","handle":"qa-50de74fdf13a","displayName":"QA 50de74fdf13a","region":"eu","role":"user","createdAt":"2026-10-29T08:39:01.421047532Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dc4f69ae-9588-4dbe-9a06-407396acfd90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc4f69ae-9588-4dbe-9a06-407396acfd90
Content-Type: application/json

--- request body ---
{"handle":"qa-becc28f3910b","password":"****"}

--- response: 200 in 23 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc4f69ae-9588-4dbe-9a06-407396acfd90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6df25f3c-f578-4afd-b64b-46e10715d4d2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-92a544b8-5231-4434-bd69-e1f9dc7af0c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92a544b8-5231-4434-bd69-e1f9dc7af0c5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-50de74fdf13a","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-92a544b8-5231-4434-bd69-e1f9dc7af0c5
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
Location: /v1/conversations/cnv_051a189e-229a-4966-83ce-46cd6e25bbef
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_051a189e-229a-4966-83ce-46cd6e25bbef","subject":"Error contract","status":"open","region":"eu","participants":["qa-becc28f3910b","qa-50de74fdf13a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:01.479101005Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-51c8f9c9-5935-4bfd-998e-1e171774f98b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-37fcef11bf274864bd116413a17bca29
X-Correlation-Id: qa-51c8f9c9-5935-4bfd-998e-1e171774f98b
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 15 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51c8f9c9-5935-4bfd-998e-1e171774f98b
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
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-51c8f9c9-5935-4bfd-998e-1e171774f98b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4a733595-7db7-47c1-abf1-739c7bac75e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a733595-7db7-47c1-abf1-739c7bac75e0
Content-Type: application/json

--- request body ---
{"handle":"qa-50de74fdf13a","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a733595-7db7-47c1-abf1-739c7bac75e0
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d7251d66-61bd-4166-98fb-bda98ce672bf"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ee7ef02b-b996-48a3-88f0-692ac04a4102

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee7ef02b-b996-48a3-88f0-692ac04a4102
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ee7ef02b-b996-48a3-88f0-692ac04a4102
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
correlation: qa-8612d704-1357-4691-8bbc-6c0dea562821

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8612d704-1357-4691-8bbc-6c0dea562821
Content-Type: application/json

--- request body ---
{"handle":"qa-50de74fdf13a","password":"****"}

--- response: 401 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8612d704-1357-4691-8bbc-6c0dea562821
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8612d704-1357-4691-8bbc-6c0dea562821"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c79f71c9-6f41-499e-adde-a775a59b3625

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c79f71c9-6f41-499e-adde-a775a59b3625
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c79f71c9-6f41-499e-adde-a775a59b3625
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
correlation: qa-7ec6d7e4-1742-42a2-a8ea-4ba97234dccc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ec6d7e4-1742-42a2-a8ea-4ba97234dccc
Content-Type: application/json

--- request body ---
{"handle":"qa-becc28f3910b","password":"****"}

--- response: 401 in 24 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7ec6d7e4-1742-42a2-a8ea-4ba97234dccc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7ec6d7e4-1742-42a2-a8ea-4ba97234dccc"}
```
