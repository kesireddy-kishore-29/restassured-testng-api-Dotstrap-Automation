# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 57 | `qa-71a81e91-4f79-43ef-9129-21d2e7508564` |
| 2 | `POST /v1/accounts` | 201 | 66 | `qa-3ee3dc57-8677-4caf-8574-5e2307184149` |
| 3 | `POST /v1/auth/token` | 200 | 52 | `qa-d01df060-2869-42ad-a7f6-0c91e5678b61` |
| 4 | `POST /v1/conversations` | 201 | 29 | `qa-862f6e34-4276-4ee9-816a-1212a50ec4df` |
| 5 | `PATCH /v1/accounts/me` | 415 | 30 | `qa-996955c1-9507-4df6-b360-e9f1f41488aa` |
| 6 | `POST /v1/auth/token` | 200 | 50 | `qa-92547c25-19a5-4712-a752-e3bdc6ea2bc0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-d8566390-83e3-4f43-94bb-d693386f3a08` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-6b2e5508-90b3-49c8-81bb-dae1d5684e5b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-e88da5b8-3eb5-4cc2-b9b5-52bc98a79909` |
| 10 | `POST /v1/auth/token` | 401 | 38 | `qa-0f8c38bd-30bb-4726-bf5b-f3fe75d6ccbd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-71a81e91-4f79-43ef-9129-21d2e7508564

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71a81e91-4f79-43ef-9129-21d2e7508564
Content-Type: application/json

--- request body ---
{"handle":"qa-3e1692eb3c6c","displayName":"QA 3e1692eb3c6c","password":"****","region":"eu"}

--- response: 201 in 57 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-71a81e91-4f79-43ef-9129-21d2e7508564
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 8
Location: /v1/accounts/qa-3e1692eb3c6c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8b7d1ba2-1650-41b9-bd77-d469f337f2ea","handle":"qa-3e1692eb3c6c","displayName":"QA 3e1692eb3c6c","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.254242797Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3ee3dc57-8677-4caf-8574-5e2307184149

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ee3dc57-8677-4caf-8574-5e2307184149
Content-Type: application/json

--- request body ---
{"handle":"qa-b3a988415d95","displayName":"QA b3a988415d95","password":"****","region":"eu"}

--- response: 201 in 66 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ee3dc57-8677-4caf-8574-5e2307184149
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 7
Location: /v1/accounts/qa-b3a988415d95
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3861ec7e-1270-42b2-932e-8911d1dfe648","handle":"qa-b3a988415d95","displayName":"QA b3a988415d95","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.372786971Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d01df060-2869-42ad-a7f6-0c91e5678b61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d01df060-2869-42ad-a7f6-0c91e5678b61
Content-Type: application/json

--- request body ---
{"handle":"qa-3e1692eb3c6c","password":"****"}

--- response: 200 in 52 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d01df060-2869-42ad-a7f6-0c91e5678b61
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b7d1ba2-1650-41b9-bd77-d469f337f2ea"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-862f6e34-4276-4ee9-816a-1212a50ec4df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-862f6e34-4276-4ee9-816a-1212a50ec4df
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b3a988415d95","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-862f6e34-4276-4ee9-816a-1212a50ec4df
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
Location: /v1/conversations/cnv_549f9527-1bca-440c-b8d6-7af40f7306cf
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_549f9527-1bca-440c-b8d6-7af40f7306cf","subject":"Error contract","status":"open","region":"eu","participants":["qa-3e1692eb3c6c","qa-b3a988415d95"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:02.488336273Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-996955c1-9507-4df6-b360-e9f1f41488aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-996955c1-9507-4df6-b360-e9f1f41488aa
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 30 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-996955c1-9507-4df6-b360-e9f1f41488aa
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-996955c1-9507-4df6-b360-e9f1f41488aa"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-92547c25-19a5-4712-a752-e3bdc6ea2bc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92547c25-19a5-4712-a752-e3bdc6ea2bc0
Content-Type: application/json

--- request body ---
{"handle":"qa-b3a988415d95","password":"****"}

--- response: 200 in 50 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-92547c25-19a5-4712-a752-e3bdc6ea2bc0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3861ec7e-1270-42b2-932e-8911d1dfe648"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d8566390-83e3-4f43-94bb-d693386f3a08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8566390-83e3-4f43-94bb-d693386f3a08
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d8566390-83e3-4f43-94bb-d693386f3a08
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
correlation: qa-6b2e5508-90b3-49c8-81bb-dae1d5684e5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b2e5508-90b3-49c8-81bb-dae1d5684e5b
Content-Type: application/json

--- request body ---
{"handle":"qa-b3a988415d95","password":"****"}

--- response: 401 in 28 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b2e5508-90b3-49c8-81bb-dae1d5684e5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6b2e5508-90b3-49c8-81bb-dae1d5684e5b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e88da5b8-3eb5-4cc2-b9b5-52bc98a79909

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e88da5b8-3eb5-4cc2-b9b5-52bc98a79909
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e88da5b8-3eb5-4cc2-b9b5-52bc98a79909
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
correlation: qa-0f8c38bd-30bb-4726-bf5b-f3fe75d6ccbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f8c38bd-30bb-4726-bf5b-f3fe75d6ccbd
Content-Type: application/json

--- request body ---
{"handle":"qa-3e1692eb3c6c","password":"****"}

--- response: 401 in 38 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f8c38bd-30bb-4726-bf5b-f3fe75d6ccbd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0f8c38bd-30bb-4726-bf5b-f3fe75d6ccbd"}
```
