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
| 1 | `POST /v1/accounts` | 201 | 406 | `qa-ad02844f-f243-40f8-8461-469e8fb321bc` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-be52a00b-bb74-49d6-9259-25d8492a70a9` |
| 3 | `POST /v1/auth/token` | 200 | 40 | `qa-56ba3ff0-c8f9-42ca-b364-7741c9fc4b63` |
| 4 | `POST /v1/conversations` | 201 | 65 | `qa-ac95bed6-6c18-4701-afa9-04d0fc309a73` |
| 5 | `POST /v1/auth/token` | 415 | 62 | `qa-7f973635-2081-4ee2-8909-f1ab86dabeeb` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-d9014072-5038-42ba-b857-46c6cf1e96ac` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-527dc125-2756-462a-879a-e28b5780edd1` |
| 8 | `POST /v1/auth/token` | 401 | 30 | `qa-a7518be2-c6d1-4151-87d2-000cf07a5e9a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 33 | `qa-e74d3a72-d87b-428f-907d-f87720a88a52` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-8f37c1fd-5c4f-43f9-8a24-cb8411cf07cd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ad02844f-f243-40f8-8461-469e8fb321bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad02844f-f243-40f8-8461-469e8fb321bc
Content-Type: application/json

--- request body ---
{"handle":"qa-3e8cd9cf86dd","displayName":"QA 3e8cd9cf86dd","password":"****","region":"eu"}

--- response: 201 in 406 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad02844f-f243-40f8-8461-469e8fb321bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Location: /v1/accounts/qa-3e8cd9cf86dd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7d31fe7c-b99e-41eb-8ffe-4322ba5a40e2","handle":"qa-3e8cd9cf86dd","displayName":"QA 3e8cd9cf86dd","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.711389473Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-be52a00b-bb74-49d6-9259-25d8492a70a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be52a00b-bb74-49d6-9259-25d8492a70a9
Content-Type: application/json

--- request body ---
{"handle":"qa-b5d8cbe29a7c","displayName":"QA b5d8cbe29a7c","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-be52a00b-bb74-49d6-9259-25d8492a70a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Location: /v1/accounts/qa-b5d8cbe29a7c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_691b1862-417e-4553-b65b-fab0bb2a95c4","handle":"qa-b5d8cbe29a7c","displayName":"QA b5d8cbe29a7c","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.954362392Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-56ba3ff0-c8f9-42ca-b364-7741c9fc4b63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56ba3ff0-c8f9-42ca-b364-7741c9fc4b63
Content-Type: application/json

--- request body ---
{"handle":"qa-3e8cd9cf86dd","password":"****"}

--- response: 200 in 40 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-56ba3ff0-c8f9-42ca-b364-7741c9fc4b63
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7d31fe7c-b99e-41eb-8ffe-4322ba5a40e2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ac95bed6-6c18-4701-afa9-04d0fc309a73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac95bed6-6c18-4701-afa9-04d0fc309a73
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b5d8cbe29a7c","subject":"Error contract","message":"Hi"}

--- response: 201 in 65 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac95bed6-6c18-4701-afa9-04d0fc309a73
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
Location: /v1/conversations/cnv_99b5b3a2-85a5-4c96-9cb5-bca3f0e234d3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_99b5b3a2-85a5-4c96-9cb5-bca3f0e234d3","subject":"Error contract","status":"open","region":"eu","participants":["qa-3e8cd9cf86dd","qa-b5d8cbe29a7c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:35.189289158Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-7f973635-2081-4ee2-8909-f1ab86dabeeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f973635-2081-4ee2-8909-f1ab86dabeeb
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 62 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7f973635-2081-4ee2-8909-f1ab86dabeeb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 10
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-7f973635-2081-4ee2-8909-f1ab86dabeeb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d9014072-5038-42ba-b857-46c6cf1e96ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9014072-5038-42ba-b857-46c6cf1e96ac
Content-Type: application/json

--- request body ---
{"handle":"qa-b5d8cbe29a7c","password":"****"}

--- response: 200 in 40 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9014072-5038-42ba-b857-46c6cf1e96ac
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_691b1862-417e-4553-b65b-fab0bb2a95c4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-527dc125-2756-462a-879a-e28b5780edd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-527dc125-2756-462a-879a-e28b5780edd1
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-527dc125-2756-462a-879a-e28b5780edd1
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
correlation: qa-a7518be2-c6d1-4151-87d2-000cf07a5e9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7518be2-c6d1-4151-87d2-000cf07a5e9a
Content-Type: application/json

--- request body ---
{"handle":"qa-b5d8cbe29a7c","password":"****"}

--- response: 401 in 30 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a7518be2-c6d1-4151-87d2-000cf07a5e9a
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a7518be2-c6d1-4151-87d2-000cf07a5e9a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e74d3a72-d87b-428f-907d-f87720a88a52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e74d3a72-d87b-428f-907d-f87720a88a52
Content-Type: application/json

--- response: 204 in 33 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e74d3a72-d87b-428f-907d-f87720a88a52
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
correlation: qa-8f37c1fd-5c4f-43f9-8a24-cb8411cf07cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f37c1fd-5c4f-43f9-8a24-cb8411cf07cd
Content-Type: application/json

--- request body ---
{"handle":"qa-3e8cd9cf86dd","password":"****"}

--- response: 401 in 27 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f37c1fd-5c4f-43f9-8a24-cb8411cf07cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8f37c1fd-5c4f-43f9-8a24-cb8411cf07cd"}
```
