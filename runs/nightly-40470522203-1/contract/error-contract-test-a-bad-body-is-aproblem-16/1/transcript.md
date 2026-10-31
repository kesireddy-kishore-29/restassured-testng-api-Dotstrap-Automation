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
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-83226dad-6e19-466a-b278-cff41638b824` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-1b1de1fd-b5a9-42de-98d7-6cc91bcf27b2` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-92851b25-6d90-48c4-92ae-e8aef802c18f` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-42162054-417c-448f-8725-fffc390aa02c` |
| 5 | `POST /v1/credits/purchases` | 415 | 11 | `qa-d27773e4-532f-4269-8f9d-b07f4bde2d60` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-ebe5313b-868f-49f8-9492-531cbf82be7f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-708f4b37-cd35-4b9a-9b61-fb37ba3a664b` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-0a98aa53-5423-4122-87ca-152c7b2715f8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-3dde7cc1-9dbd-4743-a1c6-d89f41897e69` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-87ebfd5b-5007-4098-a450-96fc524c9594` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-83226dad-6e19-466a-b278-cff41638b824

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83226dad-6e19-466a-b278-cff41638b824
Content-Type: application/json

--- request body ---
{"handle":"qa-0a5c6440fe01","displayName":"QA 0a5c6440fe01","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-83226dad-6e19-466a-b278-cff41638b824
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 6
Location: /v1/accounts/qa-0a5c6440fe01
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5dbae62f-8d6e-4f67-8cf7-0933588c0396","handle":"qa-0a5c6440fe01","displayName":"QA 0a5c6440fe01","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.818888762Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1b1de1fd-b5a9-42de-98d7-6cc91bcf27b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b1de1fd-b5a9-42de-98d7-6cc91bcf27b2
Content-Type: application/json

--- request body ---
{"handle":"qa-7c218cacc1d1","displayName":"QA 7c218cacc1d1","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b1de1fd-b5a9-42de-98d7-6cc91bcf27b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 6
Location: /v1/accounts/qa-7c218cacc1d1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9342ab43-8d80-4802-aa71-5d118127277d","handle":"qa-7c218cacc1d1","displayName":"QA 7c218cacc1d1","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.867570371Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-92851b25-6d90-48c4-92ae-e8aef802c18f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92851b25-6d90-48c4-92ae-e8aef802c18f
Content-Type: application/json

--- request body ---
{"handle":"qa-0a5c6440fe01","password":"****"}

--- response: 200 in 26 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-92851b25-6d90-48c4-92ae-e8aef802c18f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5dbae62f-8d6e-4f67-8cf7-0933588c0396"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-42162054-417c-448f-8725-fffc390aa02c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42162054-417c-448f-8725-fffc390aa02c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7c218cacc1d1","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-42162054-417c-448f-8725-fffc390aa02c
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
Location: /v1/conversations/cnv_6fecc0de-b056-4bfd-8fe8-1270bc417641
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6fecc0de-b056-4bfd-8fe8-1270bc417641","subject":"Error contract","status":"open","region":"eu","participants":["qa-0a5c6440fe01","qa-7c218cacc1d1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:35.919236972Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d27773e4-532f-4269-8f9d-b07f4bde2d60

--- request headers ---
Accept: application/json
Idempotency-Key: qa-57e1cd557e2a4094b0def34594d99749
X-Correlation-Id: qa-d27773e4-532f-4269-8f9d-b07f4bde2d60
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d27773e4-532f-4269-8f9d-b07f4bde2d60
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-d27773e4-532f-4269-8f9d-b07f4bde2d60"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ebe5313b-868f-49f8-9492-531cbf82be7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebe5313b-868f-49f8-9492-531cbf82be7f
Content-Type: application/json

--- request body ---
{"handle":"qa-7c218cacc1d1","password":"****"}

--- response: 200 in 38 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebe5313b-868f-49f8-9492-531cbf82be7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9342ab43-8d80-4802-aa71-5d118127277d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-708f4b37-cd35-4b9a-9b61-fb37ba3a664b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-708f4b37-cd35-4b9a-9b61-fb37ba3a664b
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-708f4b37-cd35-4b9a-9b61-fb37ba3a664b
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
correlation: qa-0a98aa53-5423-4122-87ca-152c7b2715f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a98aa53-5423-4122-87ca-152c7b2715f8
Content-Type: application/json

--- request body ---
{"handle":"qa-7c218cacc1d1","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0a98aa53-5423-4122-87ca-152c7b2715f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0a98aa53-5423-4122-87ca-152c7b2715f8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3dde7cc1-9dbd-4743-a1c6-d89f41897e69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dde7cc1-9dbd-4743-a1c6-d89f41897e69
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3dde7cc1-9dbd-4743-a1c6-d89f41897e69
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
correlation: qa-87ebfd5b-5007-4098-a450-96fc524c9594

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87ebfd5b-5007-4098-a450-96fc524c9594
Content-Type: application/json

--- request body ---
{"handle":"qa-0a5c6440fe01","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-87ebfd5b-5007-4098-a450-96fc524c9594
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-87ebfd5b-5007-4098-a450-96fc524c9594"}
```
