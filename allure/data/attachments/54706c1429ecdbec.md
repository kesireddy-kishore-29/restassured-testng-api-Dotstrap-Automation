# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-e18bbce1-79dd-47aa-bb1a-5e38174cd171` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-02ed5224-8757-4858-a359-5058fa78a042` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-08ef69ee-0eb9-4b17-9681-1deeb10f0932` |
| 4 | `POST /v1/conversations` | 201 | 47 | `qa-0a153d3e-19c1-43c6-a76b-ade0c774503c` |
| 5 | `POST /v1/credits/purchases` | 503 | 17 | `qa-3800b85a-b4ee-4616-b2d6-58b89d5219a6` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-d99ad1af-b629-4d42-a45e-653d3deb0991` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-68161402-5863-4df8-97ea-4f35ce4a59fb` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-b536583d-1eae-45ab-a584-fd064e7a566b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-419c4842-0918-4644-abac-7412d8f6af4f` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-22d44551-a2eb-4fd1-8b22-ec045ba06fea` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e18bbce1-79dd-47aa-bb1a-5e38174cd171

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e18bbce1-79dd-47aa-bb1a-5e38174cd171
Content-Type: application/json

--- request body ---
{"handle":"qa-a3577ee54a96","displayName":"QA a3577ee54a96","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-e18bbce1-79dd-47aa-bb1a-5e38174cd171
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 6
Location: /v1/accounts/qa-a3577ee54a96
X-Served-Region: eu
Content-Length: 181

{"id":"acc_562ba6a6-beab-41a4-a468-da61e2659495","handle":"qa-a3577ee54a96","displayName":"QA a3577ee54a96","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.440930236Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-02ed5224-8757-4858-a359-5058fa78a042

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02ed5224-8757-4858-a359-5058fa78a042
Content-Type: application/json

--- request body ---
{"handle":"qa-9dc6b6bd342d","displayName":"QA 9dc6b6bd342d","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-02ed5224-8757-4858-a359-5058fa78a042
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 6
Location: /v1/accounts/qa-9dc6b6bd342d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e122c413-df61-4625-8f61-9e9bc9054109","handle":"qa-9dc6b6bd342d","displayName":"QA 9dc6b6bd342d","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.496509850Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-08ef69ee-0eb9-4b17-9681-1deeb10f0932

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08ef69ee-0eb9-4b17-9681-1deeb10f0932
Content-Type: application/json

--- request body ---
{"handle":"qa-a3577ee54a96","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-08ef69ee-0eb9-4b17-9681-1deeb10f0932
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_562ba6a6-beab-41a4-a468-da61e2659495"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0a153d3e-19c1-43c6-a76b-ade0c774503c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a153d3e-19c1-43c6-a76b-ade0c774503c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9dc6b6bd342d","subject":"Error contract","message":"Hi"}

--- response: 201 in 47 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a153d3e-19c1-43c6-a76b-ade0c774503c
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
Location: /v1/conversations/cnv_9846b125-a6d2-497e-8be8-cbf4af32d396
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9846b125-a6d2-497e-8be8-cbf4af32d396","subject":"Error contract","status":"open","region":"eu","participants":["qa-a3577ee54a96","qa-9dc6b6bd342d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:25.603944430Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3800b85a-b4ee-4616-b2d6-58b89d5219a6

--- request headers ---
Accept: application/json
X-Fault-Key: 61655cde-c76e-4da8-9ae7-f329b4cf2e73
X-Fault: unavailable-once
Idempotency-Key: qa-a051ff7af23a4c608cd00319e91d1356
X-Correlation-Id: qa-3800b85a-b4ee-4616-b2d6-58b89d5219a6
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3800b85a-b4ee-4616-b2d6-58b89d5219a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-3800b85a-b4ee-4616-b2d6-58b89d5219a6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d99ad1af-b629-4d42-a45e-653d3deb0991

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d99ad1af-b629-4d42-a45e-653d3deb0991
Content-Type: application/json

--- request body ---
{"handle":"qa-9dc6b6bd342d","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-d99ad1af-b629-4d42-a45e-653d3deb0991
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e122c413-df61-4625-8f61-9e9bc9054109"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-68161402-5863-4df8-97ea-4f35ce4a59fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68161402-5863-4df8-97ea-4f35ce4a59fb
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-68161402-5863-4df8-97ea-4f35ce4a59fb
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
correlation: qa-b536583d-1eae-45ab-a584-fd064e7a566b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b536583d-1eae-45ab-a584-fd064e7a566b
Content-Type: application/json

--- request body ---
{"handle":"qa-9dc6b6bd342d","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b536583d-1eae-45ab-a584-fd064e7a566b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b536583d-1eae-45ab-a584-fd064e7a566b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-419c4842-0918-4644-abac-7412d8f6af4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-419c4842-0918-4644-abac-7412d8f6af4f
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-419c4842-0918-4644-abac-7412d8f6af4f
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
correlation: qa-22d44551-a2eb-4fd1-8b22-ec045ba06fea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22d44551-a2eb-4fd1-8b22-ec045ba06fea
Content-Type: application/json

--- request body ---
{"handle":"qa-a3577ee54a96","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22d44551-a2eb-4fd1-8b22-ec045ba06fea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-22d44551-a2eb-4fd1-8b22-ec045ba06fea"}
```
