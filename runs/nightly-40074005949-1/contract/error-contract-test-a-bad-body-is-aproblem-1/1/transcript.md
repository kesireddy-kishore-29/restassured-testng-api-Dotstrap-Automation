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
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-ee31ef0f-3d71-4655-aaee-b0af9732d84b` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-477a51bb-dea3-4e3b-8460-c496bcc2e0e6` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-6f020026-f6d2-4f51-a897-40927baaf8a8` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-9e561f33-b5e2-404d-b94e-0d9bbd28386f` |
| 5 | `POST /v1/auth/token` | 415 | 48 | `qa-eb148a91-2962-431b-992c-76c1c66567f5` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-798b78e1-5ddb-4e19-9395-c3ba7576ede8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 38 | `qa-e2bb88c6-bae7-4939-9484-b6494eab054a` |
| 8 | `POST /v1/auth/token` | 401 | 36 | `qa-7903e518-a7c0-42a0-9af9-0858a8473320` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-2ef64ead-0417-417a-94cc-c692d7dfff51` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-b73bd473-502f-457d-bd4e-17ff062eda9c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ee31ef0f-3d71-4655-aaee-b0af9732d84b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee31ef0f-3d71-4655-aaee-b0af9732d84b
Content-Type: application/json

--- request body ---
{"handle":"qa-cbc9ca5972d9","displayName":"QA cbc9ca5972d9","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee31ef0f-3d71-4655-aaee-b0af9732d84b
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
Location: /v1/accounts/qa-cbc9ca5972d9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4ed19d3f-bc06-45b8-8809-93cd08efc477","handle":"qa-cbc9ca5972d9","displayName":"QA cbc9ca5972d9","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.827297869Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-477a51bb-dea3-4e3b-8460-c496bcc2e0e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-477a51bb-dea3-4e3b-8460-c496bcc2e0e6
Content-Type: application/json

--- request body ---
{"handle":"qa-5b84bbc7e271","displayName":"QA 5b84bbc7e271","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-477a51bb-dea3-4e3b-8460-c496bcc2e0e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 10
Location: /v1/accounts/qa-5b84bbc7e271
X-Served-Region: eu
Content-Length: 181

{"id":"acc_743a076d-7e7c-4101-8420-192b640a3273","handle":"qa-5b84bbc7e271","displayName":"QA 5b84bbc7e271","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.876264783Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6f020026-f6d2-4f51-a897-40927baaf8a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f020026-f6d2-4f51-a897-40927baaf8a8
Content-Type: application/json

--- request body ---
{"handle":"qa-cbc9ca5972d9","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f020026-f6d2-4f51-a897-40927baaf8a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4ed19d3f-bc06-45b8-8809-93cd08efc477"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9e561f33-b5e2-404d-b94e-0d9bbd28386f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e561f33-b5e2-404d-b94e-0d9bbd28386f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5b84bbc7e271","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e561f33-b5e2-404d-b94e-0d9bbd28386f
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
Location: /v1/conversations/cnv_e1939796-0374-4ed5-a721-833fe66452c2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e1939796-0374-4ed5-a721-833fe66452c2","subject":"Error contract","status":"open","region":"eu","participants":["qa-cbc9ca5972d9","qa-5b84bbc7e271"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:01.973903632Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-eb148a91-2962-431b-992c-76c1c66567f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb148a91-2962-431b-992c-76c1c66567f5
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 48 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb148a91-2962-431b-992c-76c1c66567f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-eb148a91-2962-431b-992c-76c1c66567f5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-798b78e1-5ddb-4e19-9395-c3ba7576ede8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-798b78e1-5ddb-4e19-9395-c3ba7576ede8
Content-Type: application/json

--- request body ---
{"handle":"qa-5b84bbc7e271","password":"****"}

--- response: 200 in 31 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-798b78e1-5ddb-4e19-9395-c3ba7576ede8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_743a076d-7e7c-4101-8420-192b640a3273"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e2bb88c6-bae7-4939-9484-b6494eab054a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2bb88c6-bae7-4939-9484-b6494eab054a
Content-Type: application/json

--- response: 204 in 38 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e2bb88c6-bae7-4939-9484-b6494eab054a
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
correlation: qa-7903e518-a7c0-42a0-9af9-0858a8473320

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7903e518-a7c0-42a0-9af9-0858a8473320
Content-Type: application/json

--- request body ---
{"handle":"qa-5b84bbc7e271","password":"****"}

--- response: 401 in 36 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7903e518-a7c0-42a0-9af9-0858a8473320
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7903e518-a7c0-42a0-9af9-0858a8473320"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2ef64ead-0417-417a-94cc-c692d7dfff51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ef64ead-0417-417a-94cc-c692d7dfff51
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2ef64ead-0417-417a-94cc-c692d7dfff51
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-b73bd473-502f-457d-bd4e-17ff062eda9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b73bd473-502f-457d-bd4e-17ff062eda9c
Content-Type: application/json

--- request body ---
{"handle":"qa-cbc9ca5972d9","password":"****"}

--- response: 401 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b73bd473-502f-457d-bd4e-17ff062eda9c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b73bd473-502f-457d-bd4e-17ff062eda9c"}
```
