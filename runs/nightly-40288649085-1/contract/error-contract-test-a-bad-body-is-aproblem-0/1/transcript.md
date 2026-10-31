# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-29bc4889-8d92-4045-add1-b6744ae82e06` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-608e9901-7b6f-4372-8601-6cf7db1c9bde` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-dbe4abcf-09f0-4247-ab12-0314082651e1` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-1ba84b77-e9e1-4a69-95ae-63e2366b1fb4` |
| 5 | `POST /v1/auth/token` | 400 | 10 | `qa-4977c54d-849b-46f6-beff-f7786d672075` |
| 6 | `POST /v1/auth/token` | 200 | 48 | `qa-dbdbcc2c-2919-42f9-864a-1c4667d98c27` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-3f54276b-724e-4655-9cde-0e952b2f0002` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-e082b63e-73ef-4b29-93ce-712122198787` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-70b4cc3c-e14d-48ec-aa79-9cd052e3c7c9` |
| 10 | `POST /v1/auth/token` | 401 | 42 | `qa-9bb76c74-1652-4eed-9a91-b8fd415a9000` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-29bc4889-8d92-4045-add1-b6744ae82e06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29bc4889-8d92-4045-add1-b6744ae82e06
Content-Type: application/json

--- request body ---
{"handle":"qa-80b4c76de4b8","displayName":"QA 80b4c76de4b8","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-29bc4889-8d92-4045-add1-b6744ae82e06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-80b4c76de4b8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c8a3f4cc-0703-4d9e-a06e-92026b294f33","handle":"qa-80b4c76de4b8","displayName":"QA 80b4c76de4b8","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.245334181Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-608e9901-7b6f-4372-8601-6cf7db1c9bde

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-608e9901-7b6f-4372-8601-6cf7db1c9bde
Content-Type: application/json

--- request body ---
{"handle":"qa-fd22c22f8801","displayName":"QA fd22c22f8801","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-608e9901-7b6f-4372-8601-6cf7db1c9bde
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Location: /v1/accounts/qa-fd22c22f8801
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a316fa8c-f488-4e8e-834c-fce29ee2e20a","handle":"qa-fd22c22f8801","displayName":"QA fd22c22f8801","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.298452761Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dbe4abcf-09f0-4247-ab12-0314082651e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbe4abcf-09f0-4247-ab12-0314082651e1
Content-Type: application/json

--- request body ---
{"handle":"qa-80b4c76de4b8","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbe4abcf-09f0-4247-ab12-0314082651e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c8a3f4cc-0703-4d9e-a06e-92026b294f33"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1ba84b77-e9e1-4a69-95ae-63e2366b1fb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ba84b77-e9e1-4a69-95ae-63e2366b1fb4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fd22c22f8801","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ba84b77-e9e1-4a69-95ae-63e2366b1fb4
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
Location: /v1/conversations/cnv_0d29e7be-2d6c-477a-9839-929ce2d93add
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0d29e7be-2d6c-477a-9839-929ce2d93add","subject":"Error contract","status":"open","region":"eu","participants":["qa-80b4c76de4b8","qa-fd22c22f8801"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:46.357112865Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-4977c54d-849b-46f6-beff-f7786d672075

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4977c54d-849b-46f6-beff-f7786d672075
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4977c54d-849b-46f6-beff-f7786d672075
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 10
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-4977c54d-849b-46f6-beff-f7786d672075"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-dbdbcc2c-2919-42f9-864a-1c4667d98c27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbdbcc2c-2919-42f9-864a-1c4667d98c27
Content-Type: application/json

--- request body ---
{"handle":"qa-fd22c22f8801","password":"****"}

--- response: 200 in 48 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbdbcc2c-2919-42f9-864a-1c4667d98c27
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a316fa8c-f488-4e8e-834c-fce29ee2e20a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3f54276b-724e-4655-9cde-0e952b2f0002

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f54276b-724e-4655-9cde-0e952b2f0002
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3f54276b-724e-4655-9cde-0e952b2f0002
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
correlation: qa-e082b63e-73ef-4b29-93ce-712122198787

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e082b63e-73ef-4b29-93ce-712122198787
Content-Type: application/json

--- request body ---
{"handle":"qa-fd22c22f8801","password":"****"}

--- response: 401 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e082b63e-73ef-4b29-93ce-712122198787
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e082b63e-73ef-4b29-93ce-712122198787"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-70b4cc3c-e14d-48ec-aa79-9cd052e3c7c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70b4cc3c-e14d-48ec-aa79-9cd052e3c7c9
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-70b4cc3c-e14d-48ec-aa79-9cd052e3c7c9
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
correlation: qa-9bb76c74-1652-4eed-9a91-b8fd415a9000

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bb76c74-1652-4eed-9a91-b8fd415a9000
Content-Type: application/json

--- request body ---
{"handle":"qa-80b4c76de4b8","password":"****"}

--- response: 401 in 42 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9bb76c74-1652-4eed-9a91-b8fd415a9000
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9bb76c74-1652-4eed-9a91-b8fd415a9000"}
```
