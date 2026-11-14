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
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-4876848b-cfb3-4f20-9d52-520e3b752e49` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-15de4425-6cd4-4c3e-b30a-92df8691c27c` |
| 3 | `POST /v1/auth/token` | 200 | 4 | `qa-9c7399b8-16fa-4c5b-8836-05cad6e8c101` |
| 4 | `POST /v1/conversations` | 201 | 5 | `qa-b09ea21a-6546-4467-9146-7c86bb63808a` |
| 5 | `POST /v1/credits/purchases` | 415 | 8 | `qa-bebce1ec-e36b-46a4-8e8d-c6d056cd9e59` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-682b6a9b-9e9d-4a2e-8edc-d7c921064fc1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-feec17dd-c568-4914-9853-8f3bcf585bf5` |
| 8 | `POST /v1/auth/token` | 401 | 3 | `qa-cdaf3ea8-6874-4fcc-a04a-b1d4425fdb71` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-1ada6e00-c0c2-4d29-9d40-01d6b5d83265` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-696ab623-416f-467f-8ace-45d1c0884a83` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4876848b-cfb3-4f20-9d52-520e3b752e49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4876848b-cfb3-4f20-9d52-520e3b752e49
Content-Type: application/json

--- request body ---
{"handle":"qa-e678df11efdb","displayName":"QA e678df11efdb","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4876848b-cfb3-4f20-9d52-520e3b752e49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 8
Location: /v1/accounts/qa-e678df11efdb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9e4968b6-ab8f-4c4f-8bc4-6d76936c4e06","handle":"qa-e678df11efdb","displayName":"QA e678df11efdb","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.680265005Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-15de4425-6cd4-4c3e-b30a-92df8691c27c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15de4425-6cd4-4c3e-b30a-92df8691c27c
Content-Type: application/json

--- request body ---
{"handle":"qa-cf697618189b","displayName":"QA cf697618189b","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-15de4425-6cd4-4c3e-b30a-92df8691c27c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 8
Location: /v1/accounts/qa-cf697618189b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_12f874f8-b681-4112-86d8-6f9c7fa058c6","handle":"qa-cf697618189b","displayName":"QA cf697618189b","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.711505799Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9c7399b8-16fa-4c5b-8836-05cad6e8c101

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c7399b8-16fa-4c5b-8836-05cad6e8c101
Content-Type: application/json

--- request body ---
{"handle":"qa-e678df11efdb","password":"****"}

--- response: 200 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c7399b8-16fa-4c5b-8836-05cad6e8c101
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e4968b6-ab8f-4c4f-8bc4-6d76936c4e06"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b09ea21a-6546-4467-9146-7c86bb63808a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b09ea21a-6546-4467-9146-7c86bb63808a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cf697618189b","subject":"Error contract","message":"Hi"}

--- response: 201 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b09ea21a-6546-4467-9146-7c86bb63808a
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
Location: /v1/conversations/cnv_b8cb18da-25e4-4be1-8e85-d68bc4d8e1f4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b8cb18da-25e4-4be1-8e85-d68bc4d8e1f4","subject":"Error contract","status":"open","region":"eu","participants":["qa-e678df11efdb","qa-cf697618189b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:03.733186813Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-bebce1ec-e36b-46a4-8e8d-c6d056cd9e59

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e107beaf262d44149728600bd49bcc97
X-Correlation-Id: qa-bebce1ec-e36b-46a4-8e8d-c6d056cd9e59
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bebce1ec-e36b-46a4-8e8d-c6d056cd9e59
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-bebce1ec-e36b-46a4-8e8d-c6d056cd9e59"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-682b6a9b-9e9d-4a2e-8edc-d7c921064fc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-682b6a9b-9e9d-4a2e-8edc-d7c921064fc1
Content-Type: application/json

--- request body ---
{"handle":"qa-cf697618189b","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-682b6a9b-9e9d-4a2e-8edc-d7c921064fc1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_12f874f8-b681-4112-86d8-6f9c7fa058c6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-feec17dd-c568-4914-9853-8f3bcf585bf5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-feec17dd-c568-4914-9853-8f3bcf585bf5
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-feec17dd-c568-4914-9853-8f3bcf585bf5
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
correlation: qa-cdaf3ea8-6874-4fcc-a04a-b1d4425fdb71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdaf3ea8-6874-4fcc-a04a-b1d4425fdb71
Content-Type: application/json

--- request body ---
{"handle":"qa-cf697618189b","password":"****"}

--- response: 401 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cdaf3ea8-6874-4fcc-a04a-b1d4425fdb71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cdaf3ea8-6874-4fcc-a04a-b1d4425fdb71"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1ada6e00-c0c2-4d29-9d40-01d6b5d83265

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ada6e00-c0c2-4d29-9d40-01d6b5d83265
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1ada6e00-c0c2-4d29-9d40-01d6b5d83265
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
correlation: qa-696ab623-416f-467f-8ace-45d1c0884a83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-696ab623-416f-467f-8ace-45d1c0884a83
Content-Type: application/json

--- request body ---
{"handle":"qa-e678df11efdb","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-696ab623-416f-467f-8ace-45d1c0884a83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-696ab623-416f-467f-8ace-45d1c0884a83"}
```
