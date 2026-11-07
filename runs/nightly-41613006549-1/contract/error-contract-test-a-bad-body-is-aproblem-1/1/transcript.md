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
| 1 | `POST /v1/accounts` | 201 | 381 | `qa-735ed6bf-eb7b-4e61-b1e4-522c91c48d0b` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-2797e6e2-68fe-4672-b68a-0efc017d50dd` |
| 3 | `POST /v1/auth/token` | 200 | 50 | `qa-eff9d645-dc35-4c2d-bfd9-49321063fe49` |
| 4 | `POST /v1/conversations` | 201 | 55 | `qa-3f99f4fc-16bc-4060-85dd-d68cc503dacc` |
| 5 | `POST /v1/auth/token` | 415 | 34 | `qa-fb2fd630-bfb2-4b61-ab49-e155c4f4fd24` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-0bc4031d-8d18-4667-a462-643027038f06` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-3c919eaf-5c4e-4298-806e-11d772514384` |
| 8 | `POST /v1/auth/token` | 401 | 33 | `qa-791bf43d-4619-4e79-8a75-575e3b5ab8c3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-84486cd0-b65f-4129-8acd-429062c92e12` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-da010302-bbc6-4697-8c67-bbe33dd71830` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-735ed6bf-eb7b-4e61-b1e4-522c91c48d0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-735ed6bf-eb7b-4e61-b1e4-522c91c48d0b
Content-Type: application/json

--- request body ---
{"handle":"qa-346941a21c0b","displayName":"QA 346941a21c0b","password":"****","region":"eu"}

--- response: 201 in 381 ms ---
Date: Tue, 03 Nov 2026 09:41:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-735ed6bf-eb7b-4e61-b1e4-522c91c48d0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-346941a21c0b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0e0db84f-202e-414f-a782-a5bfc90dbb7a","handle":"qa-346941a21c0b","displayName":"QA 346941a21c0b","region":"eu","role":"user","createdAt":"2026-11-03T09:41:30.841746447Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2797e6e2-68fe-4672-b68a-0efc017d50dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2797e6e2-68fe-4672-b68a-0efc017d50dd
Content-Type: application/json

--- request body ---
{"handle":"qa-cf92c598ef1e","displayName":"QA cf92c598ef1e","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-2797e6e2-68fe-4672-b68a-0efc017d50dd
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
Location: /v1/accounts/qa-cf92c598ef1e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8a8090a7-e3ef-4761-af8c-a98b4d4c0211","handle":"qa-cf92c598ef1e","displayName":"QA cf92c598ef1e","region":"eu","role":"user","createdAt":"2026-11-03T09:41:31.209451485Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-eff9d645-dc35-4c2d-bfd9-49321063fe49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eff9d645-dc35-4c2d-bfd9-49321063fe49
Content-Type: application/json

--- request body ---
{"handle":"qa-346941a21c0b","password":"****"}

--- response: 200 in 50 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-eff9d645-dc35-4c2d-bfd9-49321063fe49
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0e0db84f-202e-414f-a782-a5bfc90dbb7a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3f99f4fc-16bc-4060-85dd-d68cc503dacc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f99f4fc-16bc-4060-85dd-d68cc503dacc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cf92c598ef1e","subject":"Error contract","message":"Hi"}

--- response: 201 in 55 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f99f4fc-16bc-4060-85dd-d68cc503dacc
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
Location: /v1/conversations/cnv_96320778-46a1-4c92-99cf-a6f86e9d8795
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_96320778-46a1-4c92-99cf-a6f86e9d8795","subject":"Error contract","status":"open","region":"eu","participants":["qa-346941a21c0b","qa-cf92c598ef1e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:31.398513010Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-fb2fd630-bfb2-4b61-ab49-e155c4f4fd24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb2fd630-bfb2-4b61-ab49-e155c4f4fd24
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 34 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb2fd630-bfb2-4b61-ab49-e155c4f4fd24
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-fb2fd630-bfb2-4b61-ab49-e155c4f4fd24"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0bc4031d-8d18-4667-a462-643027038f06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bc4031d-8d18-4667-a462-643027038f06
Content-Type: application/json

--- request body ---
{"handle":"qa-cf92c598ef1e","password":"****"}

--- response: 200 in 37 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-0bc4031d-8d18-4667-a462-643027038f06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8a8090a7-e3ef-4761-af8c-a98b4d4c0211"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3c919eaf-5c4e-4298-806e-11d772514384

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c919eaf-5c4e-4298-806e-11d772514384
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3c919eaf-5c4e-4298-806e-11d772514384
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
correlation: qa-791bf43d-4619-4e79-8a75-575e3b5ab8c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-791bf43d-4619-4e79-8a75-575e3b5ab8c3
Content-Type: application/json

--- request body ---
{"handle":"qa-cf92c598ef1e","password":"****"}

--- response: 401 in 33 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-791bf43d-4619-4e79-8a75-575e3b5ab8c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-791bf43d-4619-4e79-8a75-575e3b5ab8c3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-84486cd0-b65f-4129-8acd-429062c92e12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84486cd0-b65f-4129-8acd-429062c92e12
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-84486cd0-b65f-4129-8acd-429062c92e12
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
correlation: qa-da010302-bbc6-4697-8c67-bbe33dd71830

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da010302-bbc6-4697-8c67-bbe33dd71830
Content-Type: application/json

--- request body ---
{"handle":"qa-346941a21c0b","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da010302-bbc6-4697-8c67-bbe33dd71830
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-da010302-bbc6-4697-8c67-bbe33dd71830"}
```
